package com.dev.Object;

public class Object_methods {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		System.out.println(d1.getClass());   		// gives the fully qualified class name
		System.out.println(d2.getClass());
		
		Dog d3 = d1;
		

	}

}
