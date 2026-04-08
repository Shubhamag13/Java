package com.reference;

public class Student {
	private String name;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	Student(String name){
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	

	
	
	
}
