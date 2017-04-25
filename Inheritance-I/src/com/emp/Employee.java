package com.emp;

public class Employee {

	private int id;
	public String name;
	public String salary;

	public Employee(int id) {
		if (id > 0) {
			this.id = id;
		}
	}

	public int getId() {
		return id;
	}

}