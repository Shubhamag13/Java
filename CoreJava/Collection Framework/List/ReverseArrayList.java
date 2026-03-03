package com.Listss;

import java.util.ArrayList;

public class ReverseArrayList {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(6);
	
	int left=0;
	int right=al.size()-1;
	
	while(left<right) {
		int temp = al.get(left);
		al.set(left, al.get(right));
		al.set(right, temp);
		
		right--;
		left++;
	}
	
	
	System.out.println(al);
}
}
