package com.lambdaexpression;

interface AddTwoNumber{
	int add(int a,int b);
}

public class Add {
public static void main(String[] args) {
	AddTwoNumber ad=(a,b)->a+b;
	System.out.println(ad.add(10, 20));
}
}
