package org.huamuzhen.codewarehouse.java8;




public class SearchNumber {
	
	public static void main(String[] args) {
		
		int[] array = {3,4,5,6,7,1,2}; // a order sequence after one rotation.

		//219876543
		if(array[0] > array[array.length-1]){
			//asc
			System.out.println(findValueASC(array,3,0,array.length -1));
			System.out.println(findValueASC(array,4,0,array.length -1));
			System.out.println(findValueASC(array,5,0,array.length -1));
			System.out.println(findValueASC(array,6,0,array.length -1));
			System.out.println(findValueASC(array,7,0,array.length -1));
			System.out.println(findValueASC(array,1,0,array.length -1));
			System.out.println(findValueASC(array,2,0,array.length -1));
			System.out.println(findValueASC(array,8,0,array.length -1));
			System.out.println(findValueASC(array,199,0,array.length -1));
		}
		//int theIndex = findValueASC(array,v,0,array.length -1);
		//DESC is another case, but similar
		
	}


	private static int findValueASC(int[] array, int v,int low, int high) {
		if(low <= high){
			int mid = (high + low) /2;
			
			if(v == array[mid]){
				return mid;
			}else if(v > array[mid] ){
				if(v > array[low]){
					return findValueASC(array, v,mid + 1, high);
				}else if (v < array[low]){
					return findValueASC(array, v,low, mid -1);
				}else{
					return low;
				}
			}else{ // v < array[mid]
				if(v < array[low]){
					return findValueASC(array,v,mid+1,high);
				}else if (v > array[low]){
					return findValueASC(array,v,low,mid -1);
				}else{
					return low;
				}
			}
		}
		return -1;
		
	}

}
