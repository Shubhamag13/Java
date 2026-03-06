package com.mapp;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTablee {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(1, "hello");
		ht.put(2, "Namaste");
		ht.put(4,"HAWAA");
		ht.put(3, "Hiii");

		Set ss1 = ht.keySet();
		System.out.println(ss1);

		Collection c = ht.values();
		System.out.println(c);
		Set ss = ht.entrySet();

		Iterator itr = ss.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
