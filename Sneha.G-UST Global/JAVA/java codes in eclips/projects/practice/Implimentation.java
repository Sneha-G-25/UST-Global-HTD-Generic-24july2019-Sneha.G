package com.dev.practice;
import java.util.HashMap;

public class Implimentation implements Interface {
	
	HashMap<String,Main> hash = new HashMap<String,Main>();

	@Override
	public boolean getData(String key) {
		
		hash.get(key);
		System.out.println(hash);
			return true;
			
		
	}

	@Override
	public boolean setData(String key , Main data) {
	
		 hash.put(key, data);
		 System.out.println(hash);
		 return true;
		
	}

	@Override
	public boolean removeData(String key) {
		
		hash.remove(key);
		return true;
		
		
	}

	@Override
	public boolean containsData(String key) {
		
		if(hash.containsKey(key)) {
		return true;
		}
		return false;
	}

	@Override
	public boolean clear1() {
		hash.clear();
		return false;
	}
	
	

}
