package com.dev.Interface;

@FunctionalInterface							// to say that it is a functional interface with 1 abstract method
public interface Functional_interface {
	void display();
	
	static void print() {
		System.out.println("this is method from functional interface");
	}
	static void print1() {
		System.out.println("this is print1() from functional interface");
	}
	
	
	
	

}
