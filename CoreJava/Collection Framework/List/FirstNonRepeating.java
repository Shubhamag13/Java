package com.Listss;

import java.util.ArrayList;

public class FirstNonRepeating {
	public static void main(String[] args) {
		
	ArrayList<Integer> al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(10);
	al.add(30);
	al.add(50);
	al.add(40);
	
int first=0;
	

	for(int i: al) {
		int count=0;
		for(int j:al) {
			if(i==j) {
				count++;
				
			}
		}
			if(count==1) {
				first=i;
				break;
			}
	
	}
System.out.println(first);
	
}
}
