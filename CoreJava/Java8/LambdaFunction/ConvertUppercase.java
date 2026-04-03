package com.lambdaexpression;

interface StrUpper{
	String StrUpperr(String str);
	
}


public class ConvertUpperCase {

	public static void main(String[] args) {
		StrUpper su=str->str.toUpperCase();
		
		System.out.println(su.StrUpperr("Vansh"));
	}
	
}
