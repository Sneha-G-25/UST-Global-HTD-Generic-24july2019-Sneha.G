package com.dev.collections;

public class Practical_Assesment {

	@Override
	public String toString() {
		return "Practical_Assesment [name=" + name + ", color=" + color + ", range=" + range + ", place=" + place + "]";
	}
	private String name ;
	private String color ;
	private int range ;
	private String place ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPlace() {
		return place;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	

	

}
