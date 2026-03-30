package com.functionalinterface;

import java.util.function.Predicate;
//Check length of String using Predicate
public class PredicateExample implements Predicate<String> {
	
	//Without lambda function we use to override the test method and implemenets the Predicate class 
	@override
	public boolean test(String t) {
		if(t.length()>7) {
			return true;
		}
		else {
			
			return false;
		}
		
	}
public static void main(String[] args) {
	
	Predicate<String> p = new PredicateExample();
	System.out.println(p.test("VanshVijay"));
	System.out.println(p.test("Vansh"));
	
	//With lambda function we not need to create the object of the class and override the test method
//	Predicate<String> p = t->t.length()>7;
//	System.out.println(p.test("VanshVijay"));
}
}
