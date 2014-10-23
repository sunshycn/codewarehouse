package org.huamuzhen.codewarehouse.java8;

import java.util.stream.Stream;

public class MergeSortDemo {
	
	public static void  mergeSort(Double[] array, int left, int right){
		if(left < right){
			int center = (left + right) /2;
			mergeSort(array, left,center);
			mergeSort(array,center+1, right);
			merge(array,left,center,right);
		}
	}
	
	private static void merge(Double[] array, int leftPos, int leftEnd, int rightEnd) {
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

	public static void main(String args[]){
		Double[] array = (Double[])Stream.generate(() -> Math.random()).limit(100).toArray(Double[]::new);
		System.out.println("Before Sort:");
		for(Double d: array){
			System.out.println(d);
		}
		mergeSort(array,0, array.length -1);
		System.out.println("After Sort:");
		for(Double d: array){
			System.out.println(d);
		}
		
	}

}
