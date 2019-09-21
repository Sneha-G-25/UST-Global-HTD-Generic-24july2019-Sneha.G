package com.dev.logicalThinker;

public class Searching {

	public static void main(String[] args) {
		
		int array1[]= {10,20,30,30};
		System.out.println("output is "+check(array1,20));
		}

	
	public static boolean check(int[] array ,int key)
	{
		  key = 10;
		
		for(int i = 0 ; i< array.length ; i++) {
			if(array[i]== key) {
				return true;
			}	
	}
		return false;
	}
}


