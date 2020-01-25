package com.java8.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comprator_Java8{

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("John", "John@gmail.com", "Sales", 56000));
		empList.add(new Employee("Sam", "Sam@gmail.com", "HR", 48000));
		empList.add(new Employee("Katrina", "Katrina@gmail.com", "IT", 85000));
		empList.add(new Employee("James", "James@gmail.com", "Admin", 73000));
		empList.add(new Employee("Adrine", "Adrine@gmail.com", "HR", 66000));
		
		/* Ascending order of Employees based on their names */
		List<Employee> emp1 = empList.stream().sorted().collect(Collectors.toList());
		System.out.println(emp1);
		
		/* Ascending order of Employees based on their salary */
		List<Employee> emp2 = empList.stream().sorted((e1,e2) ->e1.getSalary().compareTo(e2.getSalary())).collect(Collectors.toList());
		System.out.println(emp2);
		
		/* Descending order of Employees based on their salary */
		List<Employee> emp3 = empList.stream().sorted((e1,e2) ->e2.getSalary().compareTo(e1.getSalary())).collect(Collectors.toList());
		System.out.println(emp3);
		
		
		  Comparator<Employee> c = (e1, e2) -> { int l1 = e1.getName().length(); int l2
		  = e2.getName().length(); if (l1<l2) return -1; else if(l1>l2) return 1; else
		  return e1.compareTo(e2); };
		  
		  List<Employee> emp4 =
		  empList.stream().sorted(c).collect(Collectors.toList());
		  System.out.println(emp4);
		 
	}

}
