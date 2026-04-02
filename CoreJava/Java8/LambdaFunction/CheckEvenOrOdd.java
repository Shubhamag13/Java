package com.lambdaexpression;

interface Check{
	boolean IsEvenOrOdd(int a);
}

public class CheckEvenOrOdd {
public static void main(String[] args) {
	Check c = a->a%2==0;
	
	System.out.println(c.IsEvenOrOdd(4));
}
}
