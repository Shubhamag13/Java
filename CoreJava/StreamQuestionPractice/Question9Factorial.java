package com.streamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Question9Factorials {
	static long factorial(int n) {

		long facto = 1;
		for (int j = 1; j <= n; j++) {
			facto *= j;

		}
		return facto;

	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,13);
		System.out.println(list);
	list.stream().map(i->factorial(i)).forEach(i->System.out.println(i));
		

// list.stream().map(n->LongStream.rangeClosed(1, n).reduce(1L,(a,b)->a*b)).forEach(i->System.out.println(i));
		
	
	}
}
