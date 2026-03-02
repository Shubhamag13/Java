package com.Listss;

import java.util.ArrayList;

public class MissingNumber {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(6);
	int sum=0;
	int n = al.getLast();
	
	int exp=n*(n+1)/2;
	
	for(int i:al) {
		sum=sum+i;
	}
	System.out.println("Missing value: "+ (exp-sum));
}
}
