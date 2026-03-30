package com.functionalinterface;

import java.util.function.Function;

public class RemoveSpaceInStringUsingFunction {

	public static void main(String[] args) {
		Function<String,Integer> f = s->s.length()-s.replaceAll(" ", "").length();
		
		
		System.out.println(f.apply("Vansh Vijay Vargiya"));
		System.out.println();
	}
}
