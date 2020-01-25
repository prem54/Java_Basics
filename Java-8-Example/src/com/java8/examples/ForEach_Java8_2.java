package com.java8.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ForEach_Java8_2 {

	public static void main(String[] args) {
		Set<String> items = new HashSet<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		System.out.println("-------------- Iterating map before Java 8 -------------");
		IterateSetUsingForEachLoop(items);
		System.out.println("--------------");
		IterateSetUsingIterator(items);

		System.out.println("-------------- Iterating map in Java 8 -------------");
		IterateSetUsingForEachandLambda(items);
		System.out.println("--------------");
		IterateSetUsingForEachandLambdaWithCondition(items);
		System.out.println("--------------");
		IterateSetUsingForEachandMethodReference(items);
		System.out.println("--------------");
		IterateSetUsingStreamsandFilters(items);

	}
	
	/* Iterate Map in Java 7 or before */
	
	public static void IterateSetUsingForEachLoop(Set<String> items) {
		for(String item : items) {
			System.out.println("item - " + item);
		}
	}
	
	public static void IterateSetUsingIterator(Set<String> items) {
		Iterator<String> iterator = items.iterator();
		while(iterator.hasNext()) {
			System.out.println("item - " + iterator.next());
		}
	}
	
	/* Iterate Map in Java 8 */
	
	public static void IterateSetUsingForEachandLambda(Set<String> items) {
		items.forEach(item -> System.out.println(item));
	}
	
	public static void IterateSetUsingForEachandLambdaWithCondition(Set<String> items) {
		items.forEach(item -> {
			if("C".equals(item)) {
				System.out.println(item);
			}
		});
	}
	
	public static void IterateSetUsingForEachandMethodReference(Set<String> items) {
		items.forEach(System.out::println);
	}
	
	public static void IterateSetUsingStreamsandFilters(Set<String> items) {
		items.stream()
		.filter(s -> s.contains("B")).forEach(System.out::println);
	}

}
