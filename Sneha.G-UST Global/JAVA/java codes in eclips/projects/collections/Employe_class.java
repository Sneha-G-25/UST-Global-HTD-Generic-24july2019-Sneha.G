package com.dev.collections;

public class Employe_class {
	
	
	@Override
	public String toString() {
		return "Employe_class [name=" + name + ", id=" + id + ", email=" + email + ", password=" + "*****" + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	private String email;
	private String password ;
	private String name;
	private int     id ;

}
