package com.Listss;

import java.util.ArrayList;

public class MoveZero {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList();
	
	al.add(4);
	al.add(0);
	al.add(5);
	al.add(0);
	al.add(6);
	al.add(7);
	int start=0;
	
	for(int i=0;i<al.size();i++) {
	
		if(al.get(i)!=0) {
			int temp=al.get(start);  //get(index)--->  get the value by index
			 al.set(start, al.get(i)); //set(index, value) set the value at this index 
			 al.set(i, temp);
			
			 start++;
		}	
			
		
	}
	

	System.out.println(al);
	
}
}
