package com.dev.exceptions;

public class exeption_handling {

	public static void main(String[] args)
			throws Exception,NegativeArraySizeException { 	// multiple exception can be handled
		try{				// programer handled exception
			sub();
		}catch(Exception e) {		//catch(NegativeArraySizeException e){}
			System.out.println("exception occured");
			e.printStackTrace();		// used to see the exception details
			System.out.println("message is" + e.getLocalizedMessage());
			}finally {
			System.out.println("this is finally block"); // block of code afetr exception
		}
		
		System.out.println("finally after"); // if their is no catch block then the program after 
		//the finally block will not be exceuted
		
//		sub();		// for throws exception throws Exception in main is also added
//		 System.out.println("code after the exception");

	}
	public static void sub() throws Exception,NegativeArraySizeException{
		StringBuffer ref1 = new StringBuffer(-3);
		
	}

}
