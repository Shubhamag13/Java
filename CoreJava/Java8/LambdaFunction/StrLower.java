package com.lambdaexpression;

interface StLo{
	String lower(String str);
}

public class StrLower {
public static void main(String[] args) {
	StLo sl = str->str.toLowerCase();
	System.out.println(sl.lower("VANSH"));
}
}
