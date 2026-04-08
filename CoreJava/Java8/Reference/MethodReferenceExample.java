package com.reference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
	
		public static void print(String s) {
			System.out.println(s);
		}
	
public static void main(String[] args) {
	List<String> students = Arrays.asList("Vanshj","Shubham","Mohit");
//	students.forEach(i->System.out.println(i));
	students.forEach(MethodReferenceExample::print);
}
}
