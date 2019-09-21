package com.dev.Method_overriding;

public class subclass extends Superclass {
	
	@Override
	public void car() {
		System.out.println("this is from child component");
		
	}
//	@Override
//	public void car1() {
//		System.out.println("this is from child component");    private anf final members can't be over ridden
//		
//	}
//	@Override
//	public void car2() {
//		System.out.println("this is from child component");
//		
//	}


	public static void main(String[] args) {
		subclass ref1 = new subclass();
		ref1.car();

	}
	
	
}
