package com.reference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceExample {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Vansh","Rajat","Shubham","Rohit");
	List<Student> students = names.stream().map(Student::new).collect(Collectors.toList());
students.forEach(i->System.out.println(i));
}
}
