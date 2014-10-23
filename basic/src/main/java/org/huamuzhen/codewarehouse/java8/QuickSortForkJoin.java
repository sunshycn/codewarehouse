package org.huamuzhen.codewarehouse.java8;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class QuickSortForkJoin extends RecursiveAction{
	

	private static final long serialVersionUID = -3847359928689145181L;
	
	final Double[] array;  
    final int start;  
    final int end;  
    private int THRESHOLD = 10; //For demo only  
  
    public QuickSortForkJoin(Double[] array) {  
        this.array = array;  
        this.start = 0;  
        this.end = array.length - 1;  
    }  
  
    public QuickSortForkJoin(Double[] array, int start, int end) {  
        this.array = array;  
        this.start = start;  
        this.end = end;  
    }  
  
    protected void compute() {  
        if (end - start < THRESHOLD)  
            sequentiallySort(array, start, end);  
        else {  
            int pivot = partition(array, start, end);  
            new QuickSortForkJoin(array, start, pivot - 1).fork();  
            new QuickSortForkJoin(array, pivot + 1, end).fork();  
        }  
    }  
  
    private  int partition(Double[] array, int low, int high) {
		double pivot = array[low];
		 while (low < high) {
			while (array[high] >= pivot && low<high ) 
			high--;
			swap(array, low, high);
			while (array[low] <= pivot && low<high) 
			low++;
			swap(array, low, high);
		}

		return low;
	}
  
    private void swap(Double[] array, int low, int high) {  
        if (low != high) {  
            double temp = array[low];  
            array[low] = array[high];  
            array[high] = temp;  
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
