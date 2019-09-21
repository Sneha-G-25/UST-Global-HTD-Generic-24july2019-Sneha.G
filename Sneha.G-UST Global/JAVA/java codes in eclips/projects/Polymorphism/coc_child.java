package com.dev.Polymorphism;



public class coc_child extends Abs_parent
{

	@Override
	void test_parent() {
		System.out.println("this is conc class of parent class");
		
	}
	 public static void main (String[] args) {
		 coc_child ref2 = new coc_child();
		 ref2.test_parent();
	 }
	@Override
	void test_parent1() {				// in concrete child class we have to overiide all the abstract methods
		System.out.println("this is  parent second abstract method");
		
	}

}
