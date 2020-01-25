package com.java8.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ForEach_Java8 {

	public static void main(String[] args) {
		Map<String, Integer> Items = new HashMap<>();
		Items.put("A", 1);
		Items.put("B", 2);
		Items.put("C", 3);
		Items.put("D", 4);
		Items.put("E", 5);

		System.out.println("-------------- Iterating map before Java 8 -------------");
		IterateMapUsingForLoop(Items);
		System.out.println("--------------");
		IterateMapUsingIterator(Items);

		System.out.println("-------------- Iterating map in Java 8 -------------");
		IterateMapUsingForEachandLambda(Items);
		System.out.println("--------------");
		IterateMapUsingStreamAPI(Items);

	}

	/* Iterate Map in Java 7 or before */

	public static void IterateMapUsingForLoop(Map<String, Integer> map) {
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " - " + "Value : " + entry.getValue());
		}
	}

	public static void IterateMapUsingIterator(Map<String, Integer> map) {
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Key : " + entry.getKey() + " - " + "Value : " + entry.getValue());
		}
	}


	/* Iterate Map in Java 8 */
	public static void IterateMapUsingForEachandLambda(Map<String, Integer> map) {
		map.forEach((K, V) -> System.out.println("Key : " + K + " - " + "Value : " + V));
	}

	public static void IterateMapUsingStreamAPI(Map<String, Integer> map) {
		map.entrySet().stream().forEach(e -> System.out.println("Key : " + e.getKey() + " - " + "Value : " + e.getValue()));
	}

}

