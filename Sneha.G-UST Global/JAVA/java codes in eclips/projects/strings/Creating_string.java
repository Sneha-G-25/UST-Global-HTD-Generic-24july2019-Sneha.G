package com.dev.strings;

public class Creating_string {

	public static void main(String[] args) {
		String str = " Hello" ;
		String ref1 = new String("New form");
		System.out.println(ref1);
		
		StringBuffer ref2 = new StringBuffer("this is buffer string");
		System.out.println(ref2);
		
		StringBuffer ref3 = new StringBuffer(-1); // u can't store negative value inside the stringbuffer
		System.out.println("buffer is"+ref3);
		
		StringBuffer ref4 = new StringBuffer("my good name is");
		System.out.println(ref4.capacity()); // this is to find out the string capacity
		
		System.out.println("Firest string is "+ str);
		String str1;
		str1 = "My name is Sneha";
		System.out.println("Second string " + str1);
		String str2 = new String ("gjbb");
		System.out.println("Third string is ");
		System.out.println(str2);


	}

}
