
package com.Listss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streammm {
	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(1, 2, 2, 2, 3, 4, 5, 5, 3, 6, 7, 8, 9, 10, 12, 3);

		// Que. Extract Even Numbers
		List<Integer> evenNumbers = new ArrayList<>();
		System.out.print("Even Number: ");
		evenNumbers = number.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);

		// Que. Extract Odd Numbers
		List<Integer> oddNumbers = new ArrayList<>();
		System.out.print("Odd Number: ");
		oddNumbers = number.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(oddNumbers);

		// Que. Remove Duplicate
		System.out.print("Unique Number: ");
		number.stream().distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();

		// Que. SKIP
		number.stream().distinct().skip(2).forEach(i -> System.out.print(i + " "));
		System.out.println();

		// Que. LIMIT
		number.stream().distinct().limit(5).forEach(j -> System.out.print(j + " "));

		System.out.println();

		// Que. Max Number using stream api
		int max = number.stream().max(Integer::compare).orElseThrow();
		System.out.println(max);

		// Que. sort list of integer in decending order using the stream api

		List<Integer> sortedNumberInDescendingOrder = number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(sortedNumberInDescendingOrder);

		// Que. Sorting
		List<Integer> sortedNumber = number.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.err.println(sortedNumber);

		// Que. Count string with specific prefix
		List<String> name = Arrays.asList("Shubham", "Shivani", "Shivangi", "Shivraj", "Sunil", "Vansh", "Daksh","Jatin", "Piyush");

		long countName = name.stream().filter(i -> i.startsWith("V")).count();

		System.out.println(countName);

		// Que. Convert string to uppercase
		List<String> upperCaseLetter = name.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseLetter);
	
		
		/*
		 * 1. Sum of number in a list
		 * 2. Count freq of character in string 
		 * 3. Count of freq of each character in string 
		 * 4. Calculate avg of numbers 
		 * 5. Reverse each string in a list
		 * 6. Find the most frequent character in string
		 * 7. Find the longest word from a sentence
		 * 8. Find first non repeating character in string
		
		*/
		
		
		
	}
}
