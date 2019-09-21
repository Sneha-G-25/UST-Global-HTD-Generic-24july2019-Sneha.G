package com.dev.Inheritance;

public class wataup1 {
	public wataup1 () {
	System.out.println("constructor with zero arguments");
	}
	public wataup1 (int i , String a) {
		System.out.println("constructor with int and string  arguments");
	}
	public wataup1 (String a, int b) {
		System.out.println("constructor with string and int arguments");
	}
	public wataup1 (char a, int b) {
		System.out.println("constructor with charecter and int arguments");
	}
	public wataup1 (String a, char b) {
		System.out.println("constructor with string and charecter arguments");
	}

	
	static String function = "messaging";
	static wataup1 ref1 = new wataup1();
	
	public void verstion1()
	{
		System.out.println("this is calling option of verstion 1");
	}
	

	public static void main(String[] args)
	{
		ref1.verstion1();
     
	}

}
