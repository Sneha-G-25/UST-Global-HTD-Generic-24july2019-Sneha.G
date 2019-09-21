package com.dev.collections;
import java.util.HashSet;

import com.dev.Encapsulation.Dog;

public class Employe_Assigment implements employe_interface {
	
static HashSet<Employe_class> hs = new HashSet<Employe_class>();
static Employe_class e = new Employe_class();

	public static void main(String[] args) {
		
		
		e.setName("Sneha");
		e.setId(453);
		e.setEmail("sneha@gmail.com");
		e.setPassword("yjhj");
		
		Employe_class e1 = new Employe_class();
		e1.setName("neha");
		e1.setId(473);
		e1.setEmail("neha@gmail.com");
		e1.setPassword("nbnb");
		
		Employe_class e2 = new Employe_class();
		e2.setName("Suma");
		e2.setId(353);
		e2.setEmail("suma@gmail.com");
		e2.setPassword("mnn");
		
		Employe_class e3 = new Employe_class();
		e3.setName("Sukanya");
		e3.setId(463);
		e3.setEmail("Sukanya@gmail.com");
		e3.setPassword("yjhjh");
		
		Employe_Assigment ref = new Employe_Assigment();
		ref.addDog(null);
		
		
		e3.setId(76);
		e2.setName("sumeksha");
	
		
		//System.out.println("output of add() :"+ b1+" "+ b2+ " "+b3);
		System.out.println(hs);
//		System.out.println("size of HashSet before removing "+ hs.size());
//		
//		System.out.println("output of remove() :"+ hs.remove(e1));
//		
//		System.out.println("size of HashSet after removing "+ hs.size());
//		
//		hs.clear();
//		
//		System.out.println("size after clearing "+ hs.size());
//		
	}
	
	public  void addDog(Dog d) {   // inseded of doing direct execution we are creating the interface of the method and giving implementation
		
		boolean b1 = hs.add(e);
//		boolean b2 = hs.add(e1);
//		boolean b3 = hs.add(e2);
		
			
	}

	@Override
	public void removeDog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  void updateDog() {
		// TODO Auto-generated method stub
		
	}

	

}
