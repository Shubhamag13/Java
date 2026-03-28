package com.functionalinterface;

import java.util.function.Function;

//Convert String into UpperCase 
//if we not use lamba function we need to implements the function in class and override the applymethod


public class FunctionExample {
	
	
	
	public static void main(String[] args) {
		
		String ss[]= {"vansh","value","shubham","rohit"};
		
		Function<String,Integer> LengthOfAll =s->s.length();
		
		for(String s:ss) {
			System.out.println(LengthOfAll.apply(s));
		}
		
		
	} 

}
