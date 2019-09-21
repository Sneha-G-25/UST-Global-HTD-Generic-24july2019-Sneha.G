package com.dev.Interface;

public class Intro_interface_child  implements Intro_interface{

	@Override
	public void intro() {
		System.out.println("this is implementation for interface method");
		
	}
	
	public static void main(String[] args) {
		Intro_interface_child ref1 = new Intro_interface_child();
		ref1.intro();
		Intro_interface.print();
		
	}

}
