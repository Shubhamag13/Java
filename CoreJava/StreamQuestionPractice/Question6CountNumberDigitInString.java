package com.streamQuestion;

import java.util.ArrayList;
import java.util.List;

public class Question6CountNumberDigitInString {
	public static void main(String[] args) {

		String name = "abc123xyz45";

		List<Character> list = new ArrayList<>();
		for (char c : name.toCharArray()) {
		    list.add(c);
		}

		System.out.println(list);

		
	long count =	list.stream().filter(i->i >='0' && i<='9').count();
		
		
		System.out.println("Number of digits: " + count);
		
		
		

	}
	
	
}
