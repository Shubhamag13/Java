package com.Listss;

import java.util.ArrayList;

public class SecHighest {
public static void main(String[] args) {
ArrayList<Integer> al = new ArrayList();
	
	al.add(4);
	al.add(3);
	al.add(5);
	al.add(2);
	al.add(6);
	al.add(7);
	
	int Highest=Integer.MAX_VALUE;
	int SecondHighest = Integer.MIN_VALUE;
	
	for(int i=0;i<al.size();i++) {
		if(Highest<al.get(i) ) {
			SecondHighest=Highest;
			Highest=al.get(i);
		}
		else if(al.get(i)>SecondHighest && al.get(i)!=Highest) {
			SecondHighest=al.get(i);
		}
	}
	
	
	
	System.out.println(Highest);
	System.out.println(SecondHighest);
}
}
