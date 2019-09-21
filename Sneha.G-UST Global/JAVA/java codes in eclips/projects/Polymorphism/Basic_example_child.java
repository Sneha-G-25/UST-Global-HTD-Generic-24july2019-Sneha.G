package com.dev.Polymorphism;

public class Basic_example_child extends Basic_example {
	@Override
	public void example() {
		System.out.println("this is from method over-riding");
	}

	public static void main(String[] args) {
		
		Basic_example_child ref2 = new Basic_example_child();
		ref2.example();
		ref2.example(6);
		ref2.sample();

	}

}
