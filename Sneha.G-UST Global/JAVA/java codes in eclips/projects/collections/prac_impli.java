package com.dev.collections;

import java.util.HashMap;

public class prac_impli implements Prac_interface {
	
	HashMap<String,Practical_Assesment> Hash = new HashMap<String,Practical_Assesment>();
	

	public static void main(String[] args) {

	}

	@Override
	public void removeData( String key) {
		
		Hash.remove(key);
		System.out.println(Hash);
		
	}

	@Override
	public boolean putdata(String key ,Practical_Assesment data  ) {
		
		  Hash.put(key, data);
		  System.out.println(Hash);
		  return true;
	}

	@Override
	public Practical_Assesment getData(String key) {
		return Hash.get(key);
		
	}



}
