package com.dev.threads;

// Firest way to craete a thraed
public class Thread2 extends Thread { // thraed immplemnt runnable hence t2 also does

	@Override
	public void run() {
		System.out.println("Thread 2 has started with j value...");
		
		for(int j=0 ; j<=0;j++) {
			System.out.println("j = "+ j);
		}
		
		System.out.println("Thread 2 had ended......");
	}
}
