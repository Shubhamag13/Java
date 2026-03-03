package com.Listss;

import java.util.ArrayList;

public class PalindromeList {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(6);
		al.add(5);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
	    al1.addAll(al);
//		System.out.println(al1);
		int left=0;
		int right=al.size()-1;
		
		while(left<right) {
			int temp = al.get(left);
			al.set(left, al.get(right));
			al.set(right, temp);
			
			right--;
			left++;
		}
		
//		System.out.println(al);222
//		
		if(al.equals(al1)) {
			System.out.println("Palindrome ");
		}
		else {
			System.out.println("Not: ");
		}
		
	}
	}
