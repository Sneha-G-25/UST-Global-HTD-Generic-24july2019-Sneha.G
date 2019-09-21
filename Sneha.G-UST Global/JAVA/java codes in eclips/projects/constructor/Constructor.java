package com.dev.constructor;

public class Constructor {

	public Constructor(int i){			//parameterized constructors
		System.out.println("this is constructor with int args");
	}
	
	public Constructor() {				// no argument constructor
	System.out.println("this is no argument constructor");
	}
	
	public Constructor(String s) {			// constuctor with string as argument
		System.out.println("this is a constructor with string argument");	
	}
	
	public Constructor(String s, int a) {
		System.out.println("order is string with int");
	}
	
	public Constructor(int a , String b) {
		System.out.println("order is int and string");
	}
	
	public Constructor( int a,String b, char c) {
		System.out.println("this has the order of int string and charcter");
	}
	
	static int area ;
	
	
	public  int areaRec(int l , int b) {
		area = l * b ;
		return area ;
	}
	
	
	public static void main (String[] args) {
		Constructor ref1 = new Constructor(2) ;
		Constructor ref2 = new Constructor() ;
		Constructor ref3 = new Constructor("sneha") ;
		Constructor ref4 = new Constructor("neha" , 12);
		Constructor ref5 = new Constructor(34,"good");
		Constructor ref6 = new Constructor(76,"mani",'d');
		
		Constructor ref7 = new Constructor();
			
		int output = ref7.areaRec(2,5);
		System.out.println(output);
		
	}

}
