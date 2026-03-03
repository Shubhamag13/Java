package com.Listss;

import java.util.ArrayList;

public class RemoveDuplicate {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(10);
	al.add(40);
	al.add(20);
	al.add(30);
	
  ArrayList<Integer> al1 = new ArrayList();
	
	for(int i: al) {
//		
		if(!al1.contains(i)) {
			al1.add(i);
		}
	}
	
	System.out.println(al1);
	
}
	
	
}
