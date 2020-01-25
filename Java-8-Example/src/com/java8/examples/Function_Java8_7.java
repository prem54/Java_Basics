package com.java8.examples;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class Function_Java8_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------Example-1------");
		Function<String, String> f1 = f -> f.concat("-Test"); 
		System.out.println(f1.apply("Sample")+"\n");
		
		System.out.println("------Example-2------");
		Function<Integer, Integer> f2 = f -> f*f;
		System.out.println(f2.apply(4)+"\n");
		
		System.out.println("------Example-3------");
		Function<String, Integer> f3 = f -> f.length();
		System.out.println(f3.apply("Microservices")+"\n");
		
		System.out.println("------Example-4------");
		Function<String, String> f4 = i -> i.toUpperCase();
		System.out.println(f4.apply("java")+"\n");
		
		System.out.println("------Example-5------");
		Function<Employee, String> f5 = e -> {
			int salary = e.getSalary();
			String jobExp = "";
			if(salary >= 70000)	jobExp = ">10 Years";
			else if(salary >= 60000) jobExp = "9 Years";
			else if(salary >= 50000) jobExp = "8 Years";
			else if(salary >= 40000) jobExp = "5 Years";
			else	jobExp = "None";
			return "Employee Name : "+e.getName() + " - " + "Employee Salary : "+e.getSalary() + " - " + "Total Exp. :"+jobExp;
		};
		Employee[] e = {
				new Employee("John", "John@gmail.com", "Sales", 56000),
				new Employee("Sam", "Sam@gmail.com", "HR", 48000),
				new Employee("Katrina", "Katrina@gmail.com", "IT", 85000),
				new Employee("James", "James@gmail.com", "Admin", 73000),
				new Employee("Adrine", "Adrine@gmail.com", "HR", 66000),
		};
		Stream.of(e).filter(e1 -> e1.getSalary()>50000).map(e1 -> f5.apply(e1)).forEach(System.out::println);
		System.out.println("\n");
		
		System.out.println("------Example-6------");
		Function<Integer, Integer> f6 = i -> i*2;
		Function<Integer, Integer> f7 = i -> i*i*i;
		System.out.println(f6.andThen(f7).apply(2));
		System.out.println(f6.compose(f7).apply(2));

		System.out.println("------Example-6------");
		BiFunction<LocalDate, String, String> f = (date, format) -> date.format(DateTimeFormatter.ofPattern(format));
		System.out.println(f.apply(LocalDate.from(ZonedDateTime.now()), "dd/MM/YYYY")+"\n");
	}

}
