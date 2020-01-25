package com.javastrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		odd_even(new ArrayList<Integer>(Arrays.asList(10, 5, 3, 4, 1, 4, 5)));
	}
	
	public static void odd_even(List<Integer> nums) {
		List<Integer> even_num = new ArrayList<Integer>();
		List<Integer> odd_num = new ArrayList<Integer>();
		for(Integer num : nums) {
			if(num%2 == 0) {
				even_num.add(num);
			}else {
				odd_num.add(num);
			}
		}
		List<Integer> merged = new ArrayList<Integer>(even_num);
        merged.addAll(odd_num);
        for(Integer value : merged) {
        	System.out.println(value);
        }
		
	}

}
