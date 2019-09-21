package com.dev.threads;

public class Thread3 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread 3 has started with k value...");
		
		for(int k=0 ; k<=10;k++) {
			System.out.println("k = "+ k);
		}
		
		System.out.println("Thread 3 had ended......");
	}
		
	}
	
	


