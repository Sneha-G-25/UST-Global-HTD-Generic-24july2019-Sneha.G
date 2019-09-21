package com.dev.collections;
import java.util.ArrayList ;
import com.dev.Encapsulation.Dog;

public class Array_list {

			public static void main(String[] args) {
				
				ArrayList<Dog> ary = new ArrayList<Dog>(2);// initial capcity is 2 but still we can re-sized
				
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
				
				ary.add(d1);
				ary.add(d);
				ary.add(d2);
				ary.add(d3);
				
				
				System.out.println(ary);
				
				
				ary.trimToSize();
				System.out.println("size of the array after trimtoize(): "+ ary.size());
				
				


	}

}
