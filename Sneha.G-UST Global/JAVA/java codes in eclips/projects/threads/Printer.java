package com.dev.threads;

public class Printer {

	synchronized public void printVal(int i , String thread) {  // syncronizes the data

		for(int j = 0 ; j<=i ;j++) {
			System.out.println("Thraed:" +thread+ " " + " j = " +j);
		}
	}

}
