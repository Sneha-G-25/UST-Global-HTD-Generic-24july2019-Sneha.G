package com.dev.collections;
import java.util.HashSet;
import com.dev.Encapsulation.Dog;

public class Collection1 {

	public static void main(String[] args) {
		HashSet<Dog> hs = new HashSet<Dog>();
		Dog d = new Dog();
		d.setAge(1);
		d.setBreed("D M");
		d.setColour("Brown");
		d.setName("Shiro");
		
		Dog d1 = new Dog();
		d1.setAge(2);
		d1.setBreed("D $ M");
		d1.setColour("Black");
		d1.setName("Shinzo");
		
		Dog d2 = new Dog();
		d2.setAge(2);
		d2.setBreed("Dolmation");
		d2.setColour("Black");
		d2.setName("Ronnie");
		
		Dog d3 = new Dog();
		d3.setAge(2);
		d3.setBreed("Dolmation");
		d3.setColour("Brown");
		d3.setName("Nikkie");
		
		boolean b = hs.add(d);
		boolean b1 = hs.add(d1);
		boolean b2 = hs.add(d2);
		boolean b3 = hs.add(d3);
		
		d.setAge(2);
		d1.setAge(5);
		d2.setAge(4);
		
		System.out.println("output of add(): "+ b + " "+ b1+ " "+b2+" "+b3);
		System.out.println(hs);
		
		System.out.println("Size of HashSet before hs : "+ hs.size());
		
		System.out.println("output of add() with second object : "+ b1);
		boolean c = hs.remove(d);
		System.out.println("output of remove() : "+ c);
		System.out.println(hs);
		
		System.out.println("output of remove() :"+ hs.contains(d));
		
		System.out.println("Size of HashSet after hs : "+ hs.size());
		
		hs.clear();
		System.out.println("Size of HashSet after clear: "+ hs.size());
	}

}
