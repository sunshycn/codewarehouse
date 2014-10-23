package org.huamuzhen.codewarehouse.java8;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class MergeSortForkJoin extends RecursiveAction{

private static final long serialVersionUID = -3847359928689145181L;
	
	final Double[] array;  
    final int start;  
    final int end;  
    private int THRESHOLD = 10; //For demo only  
  
    public MergeSortForkJoin(Double[] array) {  
        this.array = array;  
        this.start = 0;  
        this.end = array.length - 1;  
    }  
  
    public MergeSortForkJoin(Double[] array, int start, int end) {  
        this.array = array;  
        this.start = start;  
        this.end = end;  
    }  
  
    protected void compute() {  
        if (end - start < THRESHOLD)  
            sequentiallySort(array, start, end);  
        else {  
            int center = (end - start)/2;
            RecursiveAction task1 = new MergeSortForkJoin(array, start, center);  
            RecursiveAction task2 = new MergeSortForkJoin(array, center+1, end);  
            task1.fork();
            task2.fork();
            task1.join();
            task2.join();
            merge(array, start, center, end);
        }  
    }  
    
    private  void merge(Double[] array, int leftPos, int leftEnd, int rightEnd) {
		int rightPos = leftEnd + 1;
		int tmpPos = 0;
		int numElements = rightEnd - leftPos +1;
		int start = leftPos;
		Double[] tmpArray = new Double[numElements];
		while(leftPos <= leftEnd && rightPos <= rightEnd){
			if(array[leftPos] <= array[rightPos]){
				tmpArray[tmpPos++] = array[leftPos++];
			}else{
				tmpArray[tmpPos++] = array[rightPos++];
			}
		}
		while(leftPos <= leftEnd){
			tmpArray[tmpPos++] =array[leftPos++];
		}
		while(rightPos <= rightEnd){
			tmpArray[tmpPos++] =array[rightPos++];
		}
		
		//copy back to original array
		for(int i =0, j = start; i< numElements ; i++,j++){
			array[j] = tmpArray[i];
		}
		
	}
  
  
    private void sequentiallySort(Double[] array, int low, int high) {  
        Arrays.sort(array, low, high + 1);  
    }  
    
    public static void main(String args[]) throws InterruptedException{
    	Double[] array = (Double[])Stream.generate(() -> Math.random()).limit(100).toArray(Double[]::new);
    	System.out.println("Before sort:"); 
    	for (int i = 0; i < 100; i++) {  
   	       System.out.println(array[i]);
   	    }  
    	
    	ForkJoinPool forkJoinPool = new ForkJoinPool();  
 

    	  forkJoinPool.submit(new QuickSortForkJoin(array));  
    	  
    	    forkJoinPool.shutdown();  
    	    forkJoinPool.awaitTermination(1000, TimeUnit.SECONDS);  
    	    System.out.println("After sort:"); 
    	    for (int i = 0; i < 100; i++) {  
    	       System.out.println(array[i]);
    	    }  
    }
}
