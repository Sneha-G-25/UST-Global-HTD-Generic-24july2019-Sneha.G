package com.dev.exceptions;

public class coustom_exception extends Exception {
	
	public coustom_exception() {
		System.out.println("exception occured");
	}
	public coustom_exception(int i) {
		System.out.println("code for int exception");
	}
	public coustom_exception(String str) {
		System.out.println("code string exception");
	}
	
	@Override
	public String getLocalizedMessage() {
		return "their was error";
	}
	@Override
	public String getMessage() {
		return "";
	}

	
}
