package com.dev.logicalThinker;

public class BinarySearch {

	public static void main(String[] args) {
		
   int arry[] = {10,20,30,40,50};
   int y = binaryserch(arry,20);
   System.out.println(y);
	}
	
	public static int binaryserch(int[] arry , int key) {
		int start = 0;
		int end = arry.length -1;
		int mid = (start+end)/2;
		while(start<=end) {
			if(key == arry[mid]) {
				return mid;
				
			}
			else if (key < arry[mid]) {
				end = mid-1;
			}
			else 
				start = mid+1;		
		}
	
		return -1;
	}

}
