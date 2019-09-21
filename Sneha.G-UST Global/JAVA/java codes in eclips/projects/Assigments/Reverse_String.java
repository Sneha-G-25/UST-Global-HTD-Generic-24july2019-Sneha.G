package com.dev.Assigments;

public class Reverse_String {

	public static void main(String[] args) 
	{
		String str = "'Sneha G'";
		String res ="";
		for(int i = str.length()-1 ; i >=0  ; i--)
		{
			res = res + str.charAt(i);
		}
		System.out.println("reversed String is " + res);
	}

}
