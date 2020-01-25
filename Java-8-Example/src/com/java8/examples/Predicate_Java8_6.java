package com.java8.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Predicate_Java8_6 {

	public static void main(String[] args) {
		
		
		System.out.println("-----Example - 1-----");
		Predicate<String> p1 = i -> i!=null && !i.trim().isEmpty();
		System.out.println("Is String value not null and not empty : " + p1.test("abc"));
		System.out.println("Is String value not null and not empty : " + p1.test(""));
		System.out.println("Is String value not null and not empty : " + p1.test(null));
		System.out.println("Is String value not null and not empty : " + p1.test(" "));
		System.out.println("Is String value not null and not empty : " + p1.test(" A B C ") + "\n");
		
		System.out.println("-----Example - 2-----");
		Predicate<Integer> p2 = i -> i%2 == 0;
		System.out.println("Is int value is even : " + p2.test(10));
		System.out.println("Is int value is even : " + p2.test(5) + "\n");
		
		System.out.println("-----Example - 3-----");
		Predicate<Employee> p3 = i -> i.getSalary()>50000;
		System.out.println("Is Employee salary is greater than 50,000 : " + p3.test(new Employee("John", "John@gmail.com", "Sales", 56000)));
		System.out.println("Is Employee salary is greater than 50,000 : " + p3.test(new Employee("Sam", "Sam@gmail.com", "HR", 48000)) + "\n");
		
		System.out.println("-----Example - 4-----");
		Predicate<String> p4 = i -> i.length() > 5;
		System.out.println("Is String length >5 : "+ p4.test("Sample"));
		System.out.println("Is String length >5 : "+ p4.test("Test") + "\n");
		
		System.out.println("-----Example - 5-----");
		String[] strVal = {"Microsoft", "Amazon", "Google", "PWC", "Infosys"};
		Predicate<String> p5 = i -> i.length()%2 == 0;
		Stream.of(strVal).filter(i -> p5.test(i)).forEach(System.out::println);
		System.out.println("\n");
		
		System.out.println("-----Example - 6-----");
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("John", "John@gmail.com", "Sales", 56000));
		empList.add(new Employee("Sam", "Sam@gmail.com", "HR", 48000));
		empList.add(new Employee("Katrina", "Katrina@gmail.com", "IT", 85000));
		Predicate<Employee> p6 = i -> i.getSalary()>50000;
		List<Employee> emp = empList.stream().filter(i -> p6.test(i)).collect(Collectors.toList());
		System.out.println("Employee whoes salary is greater than 50,000: " + emp + "\n");
		
		System.out.println("-----Example - 7-----");
		Integer[] intVal = {0, 5, 10, 15, 20, 25, 30, 35};
		Predicate<Integer> p7 = i -> i%2 == 0;
		Predicate<Integer> p8 = i -> i>10;
		System.out.println("Numbers which are even AND greater than 10 : ");
		Stream.of(intVal).filter(i -> p7.and(p8).test(i)).forEach(System.out::println);
		System.out.println("Numbers which are even OR greater than 10 : ");
		Stream.of(intVal).filter(i -> p7.or(p8).test(i)).forEach(System.out::println);
		System.out.println("Numbers which are other than even : ");
		Stream.of(intVal).filter(i -> p7.negate().test(i)).forEach(System.out::println);
	}

}
