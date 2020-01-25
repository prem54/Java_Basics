package com.java8.examples;

class Student{
	
	String name;
	String Dept;
	
	Student(String name, String Dept){
		this.name=name;
		this.Dept=Dept;
	}
	
}

interface Interf1{
	Student Test(String name, String Dept);
}


public class ConstructorReference_Java8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Interf1 i = (name, Dept) -> new Student(name, Dept);
//		i.Test("Param", "ADM");
		
		Interf1 i1 = Student::new;
		i1.Test("Prem", "ADM");

	}

}
