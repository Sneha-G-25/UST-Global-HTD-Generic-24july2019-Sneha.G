package com.dev.Encapsulation;

public class Student {
	
	private int regNo;
	private String name ;
	private  String email;
	private String password ;
	
	//final int INT = 1 ;  final variables should be in block letters
	
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
