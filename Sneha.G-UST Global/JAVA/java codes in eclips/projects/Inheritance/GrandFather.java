package com.dev.Inheritance;

public class GrandFather {
	static GrandFather g = new GrandFather();
	String lastName = "Stark";
	String name ="Torren";
	//String name ="Torren"; 		// if this was declared inside the printName method then it is local variable
//and can't be accessed inside other class 

	public static void main(String[] args) {
		g.printName();
		

	}
	public void printName() {
		// String name ="Torren";
		System.out.println(name + " " +g.lastName);
		
	}

}
