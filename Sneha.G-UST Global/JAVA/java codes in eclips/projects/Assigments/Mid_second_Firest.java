package com.dev.Assigments;

public class Mid_second_Firest {

	public static void main(String[] args) {
	int[] array = {1,2,3,4,5,6,7,8};
	System.out.println(array.length);
	
	
	int mid = (array.length)/2;
	int firest = array[0];
	int sec = array[2];
	int sum = mid + firest + sec ;
	System.out.println("sum of mid-element second and firest element is "+ sum);
	

	}

}
