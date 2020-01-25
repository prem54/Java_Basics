package com.java8.examples;

interface Interf{
	void sum(int a, int b);
}

class Test{
	public void add(int a, int b) {
		System.out.println("Sum is : " + (a + b));
	}
}

public class MethodReference_Java8_3 {

	public static void main(String[] args) {
		
//		Interf i1 = (a, b) -> System.out.println("Sum is : " + (a + b));
//		i1.sum(100, 200);
		
		Test t = new Test();
		Interf i = t::add;
		i.sum(10, 20);
	}

}
