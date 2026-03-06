package com.mapp;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedhashMapp {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(1, "hello");
		lhm.put(4,"HAWAA");
		lhm.put(2, "Namaste");
		lhm.put(3, "Hiii");

		Set ss1 = lhm.keySet();
		System.out.println(ss1);

		Collection c = lhm.values();
		System.out.println(c);
		Set ss = lhm.entrySet();

		Iterator itr = ss.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
