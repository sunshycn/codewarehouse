package org.huamuzhen.codewarehouse.java8;

import java.util.stream.Stream;

public class QuickSortDemo {

	public static void main(String[] args) {
		Double[] array = (Double[])Stream.generate(() -> Math.random()).limit(100).toArray(Double[]::new);
		System.out.println("Before Sort:");
		for(Double d: array){
			System.out.println(d);
		}
 
		quickSort(array,0,array.length - 1);
		
		System.out.println("After Sort:");
		for(Double d: array){
			System.out.println(d);
		}
	}
	
	public static void quickSort(Double[] array, int low, int high){
		if(low < high){ // stop recursive if there is only one element
			int pivotLoc = partition(array, low, high); // find the pivot Location and, put pivot to correct place
			quickSort(array,low,pivotLoc -1); // quicksort the left sub-array
			quickSort(array,pivotLoc+1,high);// quicksort the right sub-array
		}
		
	}

	// a round of quick sort
	private static int partition(Double[] array, int low, int high) {
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

	private static void swap(Double[] array, int low, int high) {
		if(low != high){
			double tmp = array[low];
			array[low] = array[high];
			array[high] = tmp;
		}
				
	}


	

}
