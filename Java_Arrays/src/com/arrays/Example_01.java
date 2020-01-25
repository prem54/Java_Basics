package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Example_01 {

	public static void main(String[] args) {

		/*
		 * Write a java program to find common elements between two arrays? 
		 * OR 
		 * Write a java program to find intersection of two arrays?
		 */
		System.out.println("==========1==========");
		System.out.println("Common elements or intersection of two arrays: " + intersectionOf2ArrayByIteration(new String[] {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"}, new String[] {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"}));
		//Another way is: 
		System.out.println("Common elements or intersection of two arrays: "+interactionOf2ArrayByUsingMethod(new Integer[] {1, 2, 3, 4, 5, 4}, new Integer[] {3, 4, 5, 6, 7, 4}));

		System.out.println();

		/* find second largest number in an integer array */
		System.out.println("==========2==========");
		System.out.println("2nd largest no. in given Integer array is: " + secondLargestNoInArray(new Integer[] {45, 51, 28, 75, 49, 42}));

		System.out.println();

		/* All Pairs Of Elements In An Array Whose Sum Is Equal To A Given Number */
		System.out.println("==========3==========");
		//System.out.println("All Pairs Of Elements In An Array Whose Sum Is Equal To A Given Number is: " + findPair(new Integer[] {4, 6, 5, -10, 8, 5, 20}, 10));
		findPair(new Integer[] {4, 6, 5, -10, 8, 5, 20}, 10);

	}

	public static HashSet<String> intersectionOf2ArrayByIteration(String[] s1, String[] s2){

		HashSet<String> set = new HashSet<>();

		for(int i=0; i<s1.length; i++) {
			for(int j=0; j<s2.length; j++) {
				if(s1[i].equals(s2[j])) {
					set.add(s1[i]);
				}
			}
		}

		return set;

	}

	public static HashSet<Integer> interactionOf2ArrayByUsingMethod(Integer[] i1, Integer[] i2){

		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));

		set1.retainAll(set2);

		return set1;

	}

	public static int secondLargestNoInArray(Integer[] input) {
		
		int firstLargest, secondLargest;
		
		if(input[0] > input[1]) {
			firstLargest = input[0];
			secondLargest = input[1];
		}else {
			firstLargest = input[1];
			secondLargest = input[0];
		}
		
		for(int i=2; i<input.length; i++) {
			if(input[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = input[i];
			}else if(input[i] < firstLargest && input[i] > secondLargest) {
				secondLargest = input[i];
			}
		}
		
		return secondLargest;
	}

	static void findPair(Integer[] inputArray, int inputNumber) {
		
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<inputArray.length; i++) {
			for(int j=i+1; j<inputArray.length; j++) {
				//Integer[] a = new Integer[1];
				if(inputArray[i] + inputArray[j] == inputNumber) {
					//a = new Integer[] {inputArray[i], inputArray[j]};
					//a = new Integer[] {inputArray[i], inputArray[j]};
					System.out.println(inputArray[i] + "+" + inputArray[j]);
					Integer[] a = new Integer[] {inputArray[i], inputArray[j]};
					System.out.println("------ "+Arrays.toString(a));
					set.addAll(new HashSet<>(Arrays.asList(a)));
					al.addAll(i, Arrays.asList(a));
					System.out.println("set"+al);
				}
			}
		}
	}
	
	//https://javaconceptoftheday.com/how-to-separate-zeros-from-non-zeros-in-an-array/
	//https://javaconceptoftheday.com/how-to-find-all-pairs-of-elements-in-an-array-whose-sum-is-equal-to-a-given-number/
	
}