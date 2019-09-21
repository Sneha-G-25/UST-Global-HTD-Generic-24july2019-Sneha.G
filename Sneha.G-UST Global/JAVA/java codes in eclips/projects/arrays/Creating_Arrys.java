package com.dev.arrays;

public class Creating_Arrys {

	public static void main(String[] args) {
		int []array ;
		char[] array1;
		boolean array2[];	

		array = new int[4];
		array1 = new char[4];
		array2 = new boolean[2];

		array [0] = 1;
		array [1] = 2;
		array [2] = 3;
		array [3] = 5; 
		
		
//		for(int have1:array1)
//		{
//			System.out.println("output of for each is "+ array);
//		}

		array1 [0] = 'A';
		array1 [1] = 'B';
		array1 [2] = 'c';
		array1 [3] = 'D';

		array2 [0] = true;
		array2 [1] = false;
		
		int[] array3 = new int[5];   // Declaring and initializing
		int[] array4 = {2,3,4,5,6,7};
		
		// String manupilation
		int res = array [1] * 3 ;
		System.out.println("String manupilation output is " + res);
		 //System.out.println("String manupilation is " + Array[3] * 3);
		
		int out =array1[2] + 1;
		System.out.println("output for charecter array is " + out);
		
		boolean ans = !array2[1] ;
		System.out.println(ans);
		
		// to print the array
		System.out.println("element of array4 is " + array4[3]);
		
		// length method
		System.out.println("using length method length obtained is " + array4.length);
		
		
	 

	}

}
