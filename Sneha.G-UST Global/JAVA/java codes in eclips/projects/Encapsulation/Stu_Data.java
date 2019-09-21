package com.dev.Encapsulation;

public class Stu_Data {

	public static void main(String[] args) {
		Student ref1 = new Student();			// creating the object of encaplsulated class
		ref1.setRegNo(4001522);
		ref1.setEmail("sneha@gmail.com");		//setting values 
		ref1.setName("Sneha");
		ref1.setPassword("123456");
		
		System.out.println("Name of the candidate is "+ ref1.getName());
		
		String output = ref1.getEmail();
		System.out.println("Email is "+ output);
		
		System.out.println("register number is "+ ref1.getRegNo());
		

	}

}
