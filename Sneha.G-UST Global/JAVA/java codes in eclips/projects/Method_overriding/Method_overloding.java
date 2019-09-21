package com.dev.Method_overriding;

public class Method_overloding {
	static Method_overloding ref1 = new Method_overloding();
	
	public void print() {
		System.out.println("this is print() with zero argument");
	}
	public void print (int i) {
		System.out.println("this is print() with int argument");
	}
	 String print (String i) {
		System.out.println("this is print() with string argument");
		return "A";
	}
	 static int print (char i) {
			System.out.println("this is print() with char argument");
			return 1;
		}
	public static void main(String[] args) {
		ref1.print();
		ref1.print(1);
		ref1.print("sneha");
		ref1.print('s');
	}

}
