
package com.dev.collections;
import java.util.HashMap;
import com.dev.Encapsulation.Dog;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String,Dog> hm = new HashMap<String,Dog>();
		
		
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
		
		d.setAge(2);
		d1.setAge(5);
		d2.setAge(4);
		
		hm.put("1",d); // 1 is the key and d is the value
		hm.put("2",d1);
		hm.put("3",d2);
		
		
			
		System.out.println(hm);
//		Dog b = hm.put("1", d); //this won't give output for 1st time
//		System.out.println(b);
		
		Dog f= hm.remove("2");  // in return we will get the object
		System.out.println(f);
		System.out.println(hm);
		
		System.out.println("output of contains(): "+ hm.containsKey("2"));
		System.out.println("output of contains value() : " + hm.containsValue(d2));
		
	}
}
