package com.Listss;

import java.util.Iterator;
import java.util.Vector;
public class Vectorr {
public static void main(String[] args) {
	Vector v = new Vector();
	System.out.println(v.capacity());
	System.out.println(v.size());
	
	v.add(70);
	v.add(80);
	v.add(90);
	v.add("Hello");
	v.add(70);
	v.add(80);
	v.add(90);
	v.add("Hello");
	v.add(70);
	v.add(80);
	v.add(70);
	System.out.println(v.size());
	System.out.println("Capicity"+v.capacity());
	System.out.print("Vector: ");
	System.out.println(v);
	
	Iterator i2 = v.iterator();
	while (i2.hasNext()) {
		System.out.print(i2.next() + " ");
	}
	System.out.println();
	
	System.out.println(v.getLast());
	System.out.println(v.getFirst());

	
}
}
