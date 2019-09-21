package com.dev.Method_overriding;

public class Superclass {
	
	public void car() {
		System.out.println("this is frpm parent class");
	}
	private void car1() {
		System.out.println("this is frpm parent class");
	}
	final void car2() {
		System.out.println("this is frpm parent class");
	}
	
	public static void main(String[] args) {
		Superclass ref2 = new Superclass();
		ref2.car();
		

	}

}
