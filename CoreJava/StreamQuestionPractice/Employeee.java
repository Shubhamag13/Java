package com.streamQuestion;

public class Employee {

	private int id;
	String name;
	private String department;
	private int salary;

	// Constructor
	public Employee(int id, String name,  String department, int salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary="
				+ salary + "]";
	}

	
	
	
}
