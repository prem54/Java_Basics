package com.java8.examples;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Consumer_Java8_8 {

	public static void main(String[] args) {
		
		System.out.println("------Example-1------");
		Function<Employee, String> f1 = e -> {
			int salary = e.getSalary();
			String jobExp = "";
			if(salary >= 70000)	jobExp = ">10 Years";
			else if(salary >= 60000) jobExp = "9 Years";
			else if(salary >= 50000) jobExp = "8 Years";
			else if(salary >= 40000) jobExp = "5 Years";
			else	jobExp = "None";
			return jobExp;
		};
		Predicate<Employee> p1 = e -> e.getSalary()>60000;
		Consumer<Employee> c1 = e -> {
			System.out.println("Employee Name : "+e.getName() + " - " + "Employee Salary : "+e.getSalary() + " - " + "Total Exp. :"+f1.apply(e));
		};
		Employee[] e = {
				new Employee("John", "John@gmail.com", "Sales", 56000),
				new Employee("Sam", "Sam@gmail.com", "HR", 48000),
				new Employee("Katrina", "Katrina@gmail.com", "IT", 85000),
				new Employee("James", "James@gmail.com", "Admin", 73000),
				new Employee("Adrine", "Adrine@gmail.com", "HR", 66000),
		};
		Stream.of(e).filter(e1 -> p1.test(e1)).forEach(e1 -> c1.accept(e1));

	}

}
