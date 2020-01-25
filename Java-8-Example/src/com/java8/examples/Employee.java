package com.java8.examples;

public class Employee implements Comparable<Employee>{

	String Name;
	String Email;
	String Department;
	Integer Salary;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String email, String department, Integer salary) {
		super();
		Name = name;
		Email = email;
		Department = department;
		Salary = salary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Integer getSalary() {
		return Salary;
	}

	public void setSalary(Integer salary) {
		Salary = salary;
	}

	

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Email=" + Email + ", Department=" + Department + ", Salary=" + Salary
				+ "]";
	}

	@Override
	public int compareTo(Employee o) {
		int compareNameLen = o.getName().length();
		return this.getName().length() - compareNameLen;
	}

}
