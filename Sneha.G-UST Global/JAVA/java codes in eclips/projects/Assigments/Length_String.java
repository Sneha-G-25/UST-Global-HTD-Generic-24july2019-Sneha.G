package com.dev.Assigments;

public class Length_String {

	public static void main(String[] args) 
	{
		
		int[] array = {20,30,40,50};
		int array1[] = {0,0,0,0};
		int j = 0 ;
		for(int i = 3 ; i>=0 ; i--)
		{	 
			array1[j] = array[i];
			System.out.println(array1[j]);
			j++;
			
		}
	}

}
