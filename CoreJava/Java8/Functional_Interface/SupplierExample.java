package com.functionalinterface;

import java.util.function.Supplier;

public class SupplierExample {
public static void main(String[] args) {
	Supplier<String> s = ()->"HELLO!!";
	System.out.println(s.get());
	
	
	Supplier<Double> a = ()->2.00*2;
	System.out.println(a.get());
}
}
