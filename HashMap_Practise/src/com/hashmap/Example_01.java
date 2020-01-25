package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Example_01 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<>();	
		hashmap.put("One", 1);
		hashmap.put("Two", 2);
		hashmap.put("Three", 3);
		hashmap.put("Four", 4);
		hashmap.put("Five", 5);
		
		Set<Entry<String, Integer>> entrySet = hashmap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println("Key: " + entry.getKey() + " -- " + "Value: " + entry.getValue());
		}
		
		System.out.println("----------------------------------");
		
		HashMap<String, Integer> hashmap2 = new HashMap<>();
		hashmap2.put("Six", 6);
		hashmap2.put("Seven", 7);
		hashmap2.putIfAbsent("Seven", 777);
		hashmap2.putIfAbsent("Eight", 8);
		hashmap2.putAll(hashmap);
		
		entrySet = hashmap2.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println("Key: " + entry.getKey() + " -- " + "Value: " + entry.getValue());
		}
		
		System.out.println();
		Integer value = hashmap2.get("Eight");
		System.out.println("Value of \"Eight\" is: " + value);
		
		System.out.println();
		System.out.println(hashmap2.containsKey("Seven"));
		System.out.println(hashmap2.containsValue(7));
		System.out.println(hashmap2.containsKey("Nine"));
		System.out.println(hashmap2.containsValue(9));
		
		System.out.println();
		Set<String> keySet = hashmap2.keySet();
		for(String key : keySet) {
			System.out.println(key);
		}
		
		System.out.println();
		Collection<Integer> values = hashmap2.values();
		for(Integer value1 : values) {
			System.out.println(value1);
		}
		
		System.out.println();
		System.out.println(hashmap2.size());
		hashmap2.clear();
		System.out.println(hashmap2.size());

	}

}
