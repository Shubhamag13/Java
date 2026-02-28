package com.Listss;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistt {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(40);
		al.add(50);
		al.add(60);
		
		System.out.print("ArrayList: ");
		System.out.println(al);
				
		Iterator i1 = al.iterator();
		while (i1.hasNext()) {
			System.out.print(i1.next() + " ");
		}
		
		
	}


}
