package com.functionalinterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample {
public static void main(String[] args) {
	
	ArrayList<Integer> al = new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	for(int i : al) {
		System.out.println(i);
	}
	
	System.out.println("Using Stream ");
	Stream<Integer> StreamObject = al.stream();
	Consumer<Integer> c = i->System.out.println(i);
	StreamObject.forEach(c);
	
	System.out.println();
	
	Consumer<Integer> c1 = i->System.out.println(i);
	al.stream().forEach(c);
	
	
}
}
