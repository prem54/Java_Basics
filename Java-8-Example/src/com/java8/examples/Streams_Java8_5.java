package com.java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_Java8_5 {

	public static void main(String[] args) {

		/*-------Example - 1----------*/

		List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
		List<String> l1 = messages.stream().collect(Collectors.toList());
		System.out.println(l1);

		/*-------Example - 2----------*/

		List<String> messages1 = Arrays.asList("hello", "baeldung", "readers!");
		System.out.println(messages1);
		List<String> l2 = messages1.stream().filter(i -> i.startsWith("b")).collect(Collectors.toList());
		System.out.println(l2);


		/*-------Example - 3----------*/
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);

		System.out.println(l);
		List<Integer> l3 = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(l3);


		/*-------Example - 4----------*/
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(10);
		marks.add(95);
		marks.add(78);
		marks.add(30);
		marks.add(88);

		System.out.println(marks);

		/*-------Count of failed students------*/
		long failedStudents = marks.stream().filter(i -> i < 35).count();
		System.out.println(" No. of failed students : " + failedStudents);
		
		/*-------add 5 to each elements------*/
		List<Integer> graceMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println("Added 5 grace marks to each : " + graceMarks);

		/*-------sorting marks of students in ascending order-------*/
		List<Integer> marksinAscSortedOrder = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(marksinAscSortedOrder);

		/*-------sorting marks of students in descending order-------*/
		List<Integer> marksinDescSortedOrder = marks.stream().sorted((i1, i2) -> (i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		List<Integer> marksinDescSortedOrder1 = marks.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(marksinDescSortedOrder);
		System.out.println("Using compareTo() method --- " + marksinDescSortedOrder1);

		/*-------Example - 5----------*/
		ArrayList<String> al = new ArrayList<>();
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		al.add("Black");

		/*-------sorting in ascending order of alphabets-------*/
		List<String> ascOrderSorted = al.stream().sorted().collect(Collectors.toList());
		System.out.println(ascOrderSorted);

		/*-------sorting in descending order of alphabets-------*/
		List<String> descOrderSorted = al.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(descOrderSorted);

		/*-------sorting in ascending order of string length-------*/
		Comparator<String> c = (s1, s2)-> {
			int length1 = s1.length();
			int length2 = s2.length();
			if(length1<length2) return -1;
			else if(length1>length2) return 1;
			else return s1.compareTo(s2);
		};
		List<String> sortedBasedonLength = al.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedBasedonLength);
		
		
		/*-------Example - 6----------*/
		System.out.println("-------Example - 6----------");
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(60);
		al1.add(30);
		al1.add(5);
		al1.add(85);
		int minElement = al1.stream().min((a1, a2) -> a1.compareTo(a2)).get();
		System.out.println(minElement);
		
		int maxElement = al1.stream().max((a1, a2) -> a1.compareTo(a2)).get();
		System.out.println(maxElement);
		
		
		
		/*-------Example - 7----------*/
		System.out.println("-------Example - 7----------");
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(10);
		al2.add(60);
		al2.add(80);
		al2.add(92);
		al2.add(70);
		
		al2.stream().forEach(System.out::println);
		al2.forEach(System.out::println);
		
		Consumer<Integer> consumer = i -> {
			System.out.println("Square of " + i + " is : " + (i*i));
		};
		al2.stream().forEach(consumer);
		
		
		/*-------Example - 8----------*/
		System.out.println("-------Example - 8----------");
		ArrayList<Integer> al3 = new ArrayList<>();
		al3.add(10);
		al3.add(35);
		al3.add(86);
		al3.add(67);
		al3.add(75);
		ArrayList<Integer> al4 = new ArrayList<>();
		al4.add(11);
		al4.add(36);
		
		System.out.println("ArrayList max value : " + Collections.max(al3));
		System.out.println("ArrayList min value : " + Collections.min(al3));
		
		al3.addAll(al4);
		System.out.println("Combine to ArrayList elements : "+ al3);
		
		Integer[] i = al3.stream().toArray(Integer[]::new);
		Stream.of(i).forEach(System.out::println);
		
		
		/*-------Example - 8----------*/
		System.out.println("-------Example - 8-----using stream for group of elements neither Arrays nor collections-----");
		Stream<Integer> s = Stream.of(25, 87, 65, 45, 98);
		s.forEach(System.out::println);
		
		Integer[] i1 = {10, 20, 30, 40, 50};
		Stream.of(i1).forEach(System.out::println);
		
		/*-------Example - 9----------*/
		System.out.println("-------Example - 9-----");
		List<String> str = Arrays.asList("spring", "node", "microservices");
		List<String> str1 = str.stream().filter(i2->!"node".equals(i2)).collect(Collectors.toList());
		System.out.println(str1);
		//str1.forEach(System.out::println);
		
		String str2 = str.stream().filter(i2->"spring".equals(i2)).findAny().orElse(null);
		System.out.println(str2);
		
		String str3 = str.stream().filter(i2->"springboot".equals(i2)).findAny().orElse(null);
		System.out.println(str3);
		
	
	}

}
