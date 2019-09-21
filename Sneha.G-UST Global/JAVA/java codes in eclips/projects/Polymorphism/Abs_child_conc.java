package com.dev.Polymorphism;

public class Abs_child_conc extends Abs_child {
	
	 void test_parent() {
		 System.out.println("this is child class concrete class");
	 }
	 
	 @Override
		void test_parent1() {
			System.out.println("this is child implementation of parent class");
			
		}
	 public static void main (String[] args) {
		 Abs_child_conc ref1 = new Abs_child_conc();
		 ref1 . test_parent();
		 ref1.test_parent1();
	 }
	
}
