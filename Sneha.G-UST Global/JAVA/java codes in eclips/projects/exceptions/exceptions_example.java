package com.dev.exceptions;

public class exceptions_example extends coustom_exception {
	
	public static void main(String[] args) throws coustom_exception {
		
//		double d = 10.0;
//		double q = 0.0 ;
//		System.out.println("result:" + d/q);
//		System.out.println("result :" + q/d);
		
		
		sub();
		
		try {
			 divide(50,0);
		}catch(Exception e) {		
			throw new coustom_exception("hi");
		}
	}
	public static int divide(int i, int j) {
	int res = i/j ;
	System.out.println(res);
	return 1;
		
	}
	public static void sub() {
		try {
			StringBuffer ref = new StringBuffer(1);
		
		}catch (Exception e) {
			new coustom_exception().printStackTrace();
		}
	}
	
	
}
