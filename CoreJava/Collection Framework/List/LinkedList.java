package com.Listss;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLisst {
public static void main(String[] args) {
	// LinkedList
			LinkedList ll = new LinkedList();
			ll.add(10);
			ll.add(20);
			ll.add(30);
			System.out.print("LinkedList: ");
			System.out.println(ll);
			Iterator i = ll.iterator();
			while (i.hasNext()) {
				System.out.print(i.next() + " ");
			}
			System.out.println();
			
}
}
