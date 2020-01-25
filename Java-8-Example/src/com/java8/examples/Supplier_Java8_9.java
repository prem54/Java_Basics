package com.java8.examples;

import java.util.function.Supplier;

public class Supplier_Java8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------Example - 1----------");
		Supplier<String> s1 = () -> {
			String otp = "";
			for(int i=0; i<6; i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
	}

}
