package com.dev.practice;

public class Main {
	
	private String name;
	private int age;
	private String place;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Main [name=" + name + ", age=" + age + ", place=" + place + "]";
	}
	

}
