package com.dev;

import java.util.Scanner;

public class Basic_example {
	
	public void example () {
		System.out.println("this is no argument method");
	}
	public void example (int i) {
		System.out.println("this is 1 argument method");
	}
	public void example (int i , int j) {
		System.out.println("this is 2 argument method");
	}
	public void sample () {
		System.out.println("this is sample method");
		
	}
	
	public static void main(String[] args) {
		
		Basic_example ref1 = new Basic_example();
		ref1.example();
		ref1.example(4);
		// scanner method
		Scanner sc = new Scanner(System.in);
		int k;
		System.out.println("enter the integer");
		k = sc.nextInt();
		System.out.println("output of scanner is "+ k);
		
	}

}
