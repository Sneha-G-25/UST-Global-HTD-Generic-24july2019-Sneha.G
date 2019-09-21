package com.dev.collections;
import java.util.TreeSet ;
import com.dev.Encapsulation.Dog;

public class Tree_Set {

	public static void main(String[] args) {
		
		TreeSet<Dog> ts = new TreeSet<Dog>();
		
		Dog d = new Dog();
		d.setAge(1);
		d.setBreed("D M");
		d.setColour("Brown");
		d.setName("Shiro");
		
		Dog d1 = new Dog();
		d1.setAge(6);
		d1.setBreed("D $ M");
		d1.setColour("Black");
		d1.setName("Shinzo");
		
		Dog d2 = new Dog();
		d2.setAge(4);
		d2.setBreed("D M");
		d2.setColour("Brown");
		d2.setName("Shiro");
	
		Dog d3 = new Dog();
		d3.setAge(2);
		d3.setBreed("D $ M");
		d3.setColour("Black");
		d3.setName("Shinzo");
		
		ts.add(d1);
		ts.add(d);
		ts.add(d2);
		
		System.out.println(ts);

	}

}
