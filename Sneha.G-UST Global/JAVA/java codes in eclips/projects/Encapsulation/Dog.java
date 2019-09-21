package com.dev.Encapsulation;

public class Dog implements Comparable<Dog>  {
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + ", colour=" + colour + "]";
	}
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
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	

	
	private String name ;
	private int age;
	private String breed ;
	private String colour;

	
	@Override  // this is for TreeSet method we have to compare
	public int compareTo(Dog d) {
		
		return (this.age - d.age);
	}

}
