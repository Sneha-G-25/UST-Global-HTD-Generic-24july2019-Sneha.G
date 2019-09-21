package com.dev.practice;

public class One extends Super {
	
	
	public static void checkOut() {
		int[] arry = new int[4] ;
		 int arry1[] = {10,40,50,20};
		for(int i = 0 ; i<=arry1.length-1;i++) {
		System.out.println(arry1[i]);
		}
	}

	public static void main(String[] args) {
	
		One ref1 = new One();
		ref1.checkOut();
		ref1.note();

	}

}
