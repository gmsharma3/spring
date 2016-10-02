package com.spring.model;

public class Employee {

	private int id;

	private int deptId;

	private String name;

	private double salary;
	
	private String[] hobbies;

	public Employee() {

	}

	public Employee(int id, int deptId, String name, double salary, String[] hobbies) {
		this.id = id;
		this.deptId = deptId;
		this.name = name;
		this.salary = salary;
		this.hobbies = hobbies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String[] getHobbies() {
		return hobbies;
	}
	
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
}
