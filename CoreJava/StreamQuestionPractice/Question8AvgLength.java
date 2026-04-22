package com.streamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Question8AvgLength {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("Vansh", "Shubham", "Daksh", "Sonu", "Abhinav");

		long count = name.stream().count();
//	System.out.println(count);

		List<Integer> list = name.stream().map(i -> i.length()).collect(Collectors.toList());
		int sum = 0;
		for (Integer al : list) {
			sum = sum + al;
		}
//System.out.println(sum);
//		OptionalDouble avg =name.stream().mapToInt(i->i.length()).average();
			   

//		System.out.println(avg);
		
		Double avgg = name.stream().collect(Collectors.averagingDouble(String::length));
		System.out.println(avgg);
		System.out.println("Avg Length of String is : " + sum / count);

	}
}
