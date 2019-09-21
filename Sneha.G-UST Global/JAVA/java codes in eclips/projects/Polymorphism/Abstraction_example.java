package com.dev.Polymorphism;

public abstract class Abstraction_example {		// abstract class can have both concrete and abstract methods
	
	public Abstraction_example() {				// we can create a constroctar for abstract class but not object
		
	}
	
	abstract void display();			// abstract method does not take a body
	
	public void show() {
		System.out.println("Concrete method of abstract class");
	}

}
