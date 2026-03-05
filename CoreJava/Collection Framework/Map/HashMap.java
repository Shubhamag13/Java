package com.mapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapp {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "hello");
		hm.put(2, "Namaste");
		hm.put(4,"HAWAA");
		hm.put(3, "Hiii");

		System.out.println(hm.get(3));
		
		Set ss1 = hm.keySet();
		System.out.println(ss1);

		
		Collection c = hm.values();
		System.out.println(c);
		
		Set ss = hm.entrySet();

		Iterator itr = ss.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
