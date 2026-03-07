package com.mapp;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeeMap {
	public static void main(String[] args) {
		TreeMap hm = new TreeMap();
		hm.put(1, "hello");
		hm.put(2, "Namaste");
		hm.put(4,"HAWAA");
		hm.put(3, "Hiii");

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
