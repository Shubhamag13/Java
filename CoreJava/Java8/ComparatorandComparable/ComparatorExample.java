package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2-o1 ;
	}
	
}




public class ComparatorExample {
public static void main(String[] args) {
//	List<Integer> l = new ArrayList<>();
//	l.add(10);
//	l.add(30);
//	l.add(20);
//	l.sort(new MyComparator());
//	System.out.println(l);
	
	List<String> words = Arrays.asList("banana","apple","date");
	words.sort((a,b)-> a.length()-b  .length());
	System.out.println(words);
}
}
