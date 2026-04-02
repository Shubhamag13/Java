package com.lambdaexpression;

interface TwoString{
	String ConcateString(String str1,String str2);
}

public class ConcateTwoString {	
	
	public static void main(String[] args) {
		TwoString ts=(str1,str2)->str1.concat(str2);
	System.out.println(ts.ConcateString("Vansh", " Vijay"));	
	}
	
}
