package com.javastrings;

public class Example_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = { "hacker", "hack", "hackerrank" };
	      int n = 3;
	      System.out.println("The original order of the words is: ");

	      for(int i = 0; i < n; i++) {
	         System.out.println(words[i]);
	      }
	      for(int i = 0; i < n-1; ++i) {
	         for (int j = i + 1; j < n; ++j) {
	            if (words[i].compareTo(words[j]) > 0) {
	               String temp = words[i];
	               words[i] = words[j];
	               words[j] = temp;
	            }
	         }
	      }
	      System.out.println("\nThe lexicographical order of the words is: ");
	      
	      for(int i = 0; i < n; i++) {
	         System.out.println(words[i]);
	      }
	      
	      System.out.println("\nThe lexicographical sorted and concatinated String is: ");
	      String word = words[0];
	      for(int i=1; i<n; i++) {
	    	  word= word + words[i];
	      }
	      System.out.println(word);
	      

	}

}
