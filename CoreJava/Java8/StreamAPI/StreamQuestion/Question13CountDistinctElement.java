package com.streamQuestion;

import java.util.Arrays;
import java.util.List;

public class Question13CountDistinctElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,3,5,4,5,6,7,8,8,8);
		long count = list.stream().distinct().count();
		System.out.println(count);
	}
}
