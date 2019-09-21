package com.dev.Polymorphism;

public abstract  class Abstarction_example1 extends Abstraction_example {
	
	
	public Abstarction_example1() {
		System.out.println("Constructor for abstraction class");
	}
	
	
	@Override
	 void display() {							// since the class is abstract giving definition for method is optional
		
		System.out.println("this is a impletended abstract method ");
		
	}
	public static void main (String[] args) {
		//Abstarction_example1 ref = new Abstarction_example1();
//		ref.display();
//		ref.show();
		
	}

}
