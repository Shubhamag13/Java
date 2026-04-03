package com.lambdaexpression;
interface Pr{
	boolean IsPrime(int a);
}
public class IsPrimeUsingLambda {
public static void main(String[] args) {
		Pr p= a->{
		int count=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				count++;
		}
	}
		if(count==0)  return true;
		return false;
	};
System.out.println(p.IsPrime(2));
}
}
