package com.streamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question7MostFrequentlyOccuring {
public static void main(String[] args) {
	List<Integer> list =Arrays.asList(1,2,3,4,4,5,6,6,1,2,2);
	
Map<Integer, Long> a=	list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));


Optional<Object> mostfr = a.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);

System.out.println(mostfr);

}
	
}
