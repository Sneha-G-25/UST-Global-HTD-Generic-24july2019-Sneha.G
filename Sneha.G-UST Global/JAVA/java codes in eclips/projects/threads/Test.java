package com.dev.threads;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main thraed starts....");
		
		for(int i = 0; i<=10; i++) {
			System.out.println("i = "+ i);
		}
		for(int i = 0 ; i< 10 ; i++) {
			System.out.println("j "+ i);
		}
		
		System.out.println("Main thread ends....");


	}

}
