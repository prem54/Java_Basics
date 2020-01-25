package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example_02 {

	public static void main(String[] args) {

		System.out.println("-----Example-1--Combine elements of Array in a single Array---");
		int[] a1 = {2, 4, 6, 7, 9};
		int[] a2 = {12, 14, 16, 17, 19};
		
		int[] result1 = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).toArray();
		System.out.println(Arrays.toString(result1));
		
		String[] b1 = new String[]{"Java", "Spring", "SpringBoot", "Python", "go"};
		String[] b2 = new String[]{"AWS", "Azure", " " , "GCP", null};
		
		String[] result2 = Stream.of(b1, b2).flatMap(Stream::of).toArray(String[]::new);
		System.out.println(Arrays.toString(result2));
		
		
		System.out.println("-----Example-2--Print max element from Array---");
		int[] c = {56, 85, 785, 586, 7845};
		
		/*----Java 8---*/
		int result3 = Arrays.stream(c).max().getAsInt();
		System.out.println(result3);
		
		/*----Before Java 8---*/
		int max = c[0];
		for(int x=1; x <c.length; x++) {
			if(c[x] > max) {
				max = c[x];
			}
		}
		System.out.println(max);
		
		
		System.out.println("-----Example-3--Filter Employees whoes name starts with 'A' and double their salary and put it in a new List---");
		List<Employee> empList1 = new ArrayList<>();
		empList1.add(new Employee("Antony", "John@gmail.com", "Sales", 2000));
		empList1.add(new Employee("Andrew", "Sam@gmail.com", "HR", 1500));
		empList1.add(new Employee("Kathrin", "Katrina@gmail.com", "IT", 1800));
		
		/*----Before Java 8---*/
		List<Employee> result = new ArrayList<>();
		for(Employee tempEmployee : empList1) {
			Employee finalEmp = new Employee();
			if(tempEmployee.getName().startsWith("A")) {
				finalEmp.setName(tempEmployee.getName());
				finalEmp.setEmail(tempEmployee.getEmail());
				finalEmp.setDepartment(tempEmployee.getDepartment());
				finalEmp.setSalary(tempEmployee.getSalary() * 2);
				result.add(finalEmp);
			}			
		}
		System.out.println("Updated Employee : "+ result);
		
		/*----Java 8---*/
		List<Employee> UpdatedEmpList = empList1.stream().filter(e -> e.getName().startsWith("A")).map(temp -> {
			Employee e = new Employee();
			e.setName(temp.getName());
			e.setDepartment(temp.getDepartment());
			e.setEmail(temp.getEmail());
			e.setSalary(temp.getSalary() * 2);
			return e;
		}).collect(Collectors.toList());
		System.out.println(UpdatedEmpList);
		
	}

}
