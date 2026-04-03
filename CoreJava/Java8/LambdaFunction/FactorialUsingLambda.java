package com.lambdaexpression;

interface Fact{
	int Facto(int a);
}

public class FactorialUsingLambda {

	public static void main(String[] args) {
		Fact f = a->{
			int fact=1;
			for(int i=1;i<=a;i++) {
				fact*=i;
			}
			return fact;
		};
		System.out.println(f.Facto(5));
	}
	
}
