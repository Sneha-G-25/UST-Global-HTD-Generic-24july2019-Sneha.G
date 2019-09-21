package com.dev.practice;

public class Data extends Main {

	public static void main(String[] args) {
		
		Implimentation ref = new Implimentation();
		
		Data r = new Data();
		  
		r.setAge(23);
		r.setName("Suma");
		r.setPlace("Belandhur");
		
		Data r1 = new Data();
		  
		r1.setAge(23);
		r1.setName("Suma");
		r1.setPlace("Belandhur");
		
	boolean s = ref.setData("1", r);
	boolean s1 = ref.setData("2", r1);
		System.out.println(s);
		
		boolean s2 = ref.removeData("1");
		System.out.println(s2);
		
		boolean s3 = ref.getData("r");
		System.out.println(s3);
		
		boolean s4 = ref.containsData("10");
		System.out.println(s4);
		ref.clear1();
		
		ref.getData("2");
	}

}
