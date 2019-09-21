package com.dev.Object;

public class Dog_data {

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
		
		ref3.setAge(2);
		ref3.setBreed("Germon Shepherd");
		ref3.setColour("Brown");
		ref3.setName("Spike");
		
		Dog[] dogs = {ref1,ref2,ref3};
		
		for(int i = 0 ; i < dogs.length ; i++ )
//		{
//			System.out.println("Age " + dogs[i].getAge());
//			System.out.println("Name " + dogs[i].getName());
//			System.out.println("Colour " + dogs[i].getColour());
//			System.out.println("Breed " + dogs[i].getBreed());
			System.out.println(dogs[i]);				// to string methods genrates the value of theof dog object 
//		}
		
		
		System.out.println(ref2.equals(ref3));			//for equals method
		System.out.println(ref2.hashCode());
		System.out.println(ref3.hashCode());
		

	}

}

