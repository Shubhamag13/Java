package com.Listss;

import java.util.ArrayList;

public class SecLowest {
public static void main(String[] args) {
ArrayList<Integer> al = new ArrayList();
	
	al.add(4);
	al.add(3);
	al.add(5);
	al.add(2);
	al.add(6);
	al.add(7);
	
	int Smallest=Integer.MAX_VALUE;
	int SecondSmallest = Integer.MAX_VALUE;
	
	for(int i=0;i<al.size();i++) {
		if(Smallest>al.get(i) ) {
			SecondSmallest=Smallest;
			Smallest=al.get(i);
		}
		else if(al.get(i)<SecondSmallest && al.get(i)!=Smallest) {
			SecondSmallest=al.get(i);
		}
	}
	System.out.println(Smallest);
	System.out.println(SecondSmallest);
}
}
