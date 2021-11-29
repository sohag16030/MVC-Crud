package com.employee.model;

public class Employee {

	private long id;
	private String lastName;
	private String firstName;
    private String designation;

	public Employee(long id, String lastName, String firstName, String designation) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.designation = designation;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", designation="
				+ designation + "]";
	}

	
	
}
