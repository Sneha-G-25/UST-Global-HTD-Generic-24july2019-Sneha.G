package com.dev.exceptions;

public class Throw_Throws extends coustom_exception{

	public static void main(String[] args) throws coustom_exception {
		
		try {
			sub();
			System.out.println("no exception for sub()");
			int res = divide(50,0);
			System.out.println("no exception for divide()");
			System.out.println(res);
		}catch(NegativeArraySizeException e) {	
			
			System.out.println("Exception caugth ");
			System.out.println("getMessage() :" + e.getMessage());
			//throw new coustom_exception();
		}catch(ArithmeticException e) {
			System.out.println("Exception for arithmatic");
			System.out.println("getMessage():"+ e.getLocalizedMessage());
		}finally {
			System.out.println("finally block");	
		}
	}
	public static void sub() throws coustom_exception{
		int i = 1 ;
		try {
			StringBuffer ref = new StringBuffer(i);
			
		}catch(Exception e) {
			
			if(i<0) ;
			throw new NegativeArraySizeException() ;
		}
	}
	
	public static int divide(int i, int j)throws coustom_exception {
		try {
		int res = i/j ;
		return res;
		}catch(Exception e) {
			throw new ArithmeticException();
		}
			}
}
