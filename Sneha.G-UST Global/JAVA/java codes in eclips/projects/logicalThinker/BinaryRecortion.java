package com.dev.logicalThinker;

public class BinaryRecortion {

	public static void main(String[] args) {
		
		int arry[] = {10,20,30,40};
		int low = 0;
		int high = arry.length-1;
		int y = recorstion(arry,low,high,20);
		System.out.println("output is "+ y);
		
	}
	public static int recorstion(int[] arr,int low,int high,int data) {
		int mid = low +(high-low)/2;
		if(low<=high) {
			if(data == arr[mid]) {
				return mid;
			}
			else if(data>arr[mid]) {
				return  recorstion(arr,mid+1,high,data);
			}
			else{
				return  recorstion(arr,low,mid-1,data);
			}
		}
		return -1;
	}
}
