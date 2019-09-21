package com.dev.Encapsulation;

public class Dog_Data {

	public static void main(String[] args) {
		
		Dog ref1 = new Dog();
		Dog ref2 = new Dog();
		Dog ref3 = new Dog();
		
		ref1.setBreed("Dober Man");
		ref1.setName("Shiro");
		ref1.setColour("Black");
		ref1.setAge(1);
		
		ref2.setAge(2);
		ref2.setBreed("Germon Shepherd");
		ref2.setColour("Brown");
		ref2.setName("Spike");
		
		ref3.setAge(3);
		ref3.setBreed("Germon Sheperd");
		ref3.setColour("Black & brown");
		ref3.setName("Abby");
		
		Dog[] dogs = {ref1,ref2,ref3};
		
		for(int i = 0 ; i < dogs.length ; i++ )
		{
			System.out.println("Age " + dogs[i].getAge());
			System.out.println("Name " + dogs[i].getName());
			System.out.println("Colour " + dogs[i].getColour());
			System.out.println("Breed " + dogs[i].getBreed());
		}
		
		
		

	}

}
