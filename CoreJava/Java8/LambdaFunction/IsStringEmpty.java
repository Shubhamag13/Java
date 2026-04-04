package com.lambdaexpression;

interface IsEmpty{
	Boolean StringEmpty(String str);
}


public class IsStringEmpty {

	public static void main(String[] args) {
		IsEmpty s= str->str.isEmpty();
		
		System.out.println(s.StringEmpty("Vansh"));
	}
	
}
