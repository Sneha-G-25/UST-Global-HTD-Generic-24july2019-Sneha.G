package com.dev.Inheritance;

public class Daughter extends Father {

	static Daughter d = new Daughter() ;
	@Override
	public void printName() {
		String name =" Sansa";
		System.out.println(name+" "+ d.name + " "+ d.lastName);
	}
	public static void main(String[] args) {
		d.printName();
		

	}

}
