package com.functionalinterface;

import java.util.function.Predicate;
//Predicate Joining {and,or and negate}
public class EvenNumberUsingPredicate {

	public static void isLessThan50(Predicate<Integer> p,int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(p.test(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int nums[]= {10,20,3,50,30,55,142,454,20,236,78,50};
		Predicate<Integer> p= i->i>50;
		Predicate<Integer> p1= i->i%2!=0;
		//negate is reverse the value like we have true and we use negate its convert true into false
		isLessThan50(p.negate(), nums);
		
		//both predicate must be true then its return true
		isLessThan50(p.and(p1), nums);
		
		//if any one predicate return true its return the value[true ]
		isLessThan50(p.or(p1),nums );
	}
}
