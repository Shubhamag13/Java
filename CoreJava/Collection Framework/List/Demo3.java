package com.Listss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo45 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 3, 4, 2, 3, 4, 5, 3, 2, 2, 3);

		//even
		List<Integer> evenNumber = new ArrayList<>();
		System.out.print("Even Number: ");
		evenNumber = number.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumber);
		
		///odd
		System.out.print("Odd Number: ");
		List<Integer> oddNumber = new ArrayList<>();
		oddNumber = number.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.print(oddNumber);
		
		System.out.println();
		
		//unique
		System.out.print("Unique: ");
		number.stream().distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//skip
		System.out.print("Skip starting: ");
		number.stream().distinct().skip(2).forEach(i -> System.out.print(i + " "));
		
		System.out.println();
		
		//limit
		System.out.print("Limited Number: ");
		number.stream().distinct().limit(5).forEach(i -> System.err.print(i + " "));
		
		System.out.println();
		
		//max
		int max = number.stream().max(Integer::compare).orElseThrow();
		System.out.println("Max Number in List: " + max);


		//sorted Descending order	
		System.out.print("SortedInDescOrder: ");
		List<Integer> sortedNumberInDescendingOrder = number.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		System.out.println(sortedNumberInDescendingOrder);

		
		//Sorted
		System.out.print("Sorted: ");
		List<Integer> sortedNumber = number.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.err.println(sortedNumber);

		
		//String start with specific character
		List<String> name = Arrays.asList("Shubham", "Shivani", "Shivangi", "Shivraj", "Sunil", "Vansh", "Daksh",
				"Jatin", "Piyush");

		long countName = name.stream().filter(i -> i.startsWith("V")).count();

		System.out.println("Total " + countName);

		
		//Convert String into UpperCase
		System.out.print("UpperCase: ");
		List<String> upperCaseLetter = name.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseLetter);
	}
}
