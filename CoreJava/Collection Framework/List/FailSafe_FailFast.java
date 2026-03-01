package com.Listss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
	Iterator itr = al.iterator();	
	
	while(itr.hasNext()) {
		 System.out.println(itr.next()); 
		 al.remove(10);
	}
	al.add(52);
	System.out.println(al);
	}
}
