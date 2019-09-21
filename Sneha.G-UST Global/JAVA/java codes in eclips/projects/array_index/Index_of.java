package com.dev.array_index;

public class Index_of {

	public static void main(String[] args) {
		int arryIndex[] = {22,54,73,78,24,96};
		int num = 2 ;
		
		if(num<arryIndex.length)
		{
			System.out.println("their is an elemnt");
			for(int i = 0 ; i<=num ;i ++)
			{    System.out.println("Elements before the index are " +arryIndex[i]);

			}
			
			// To find mid element in the array
			int mid = 0;
			mid = (arryIndex.length-1)/2;
			System.out.println("mid element is " + mid);
			
		}
		else 
		{
			System.out.println("index out of bound");
		}


	}
}
