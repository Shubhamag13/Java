package com.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class IterateListUsingLambda {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vansh","Shubham","Rohit");	
		names.forEach(i->System.out.println(i));
	}
}
