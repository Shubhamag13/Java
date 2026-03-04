package com.Listss;

import java.util.Iterator;
import java.util.Stack;

public class Stackk {
public static void main(String[] args) {
	Stack s = new Stack();
	System.out.println(s.size());
	System.out.println(s.capacity());

//	System.out.println(s.peek());
	s.add(40);
	s.add(10);
	s.add(10);
	s.add(40);
	s.push(60);
	s.push(30);
	System.out.println(s);
	System.out.println(s.search(40));
//	s.push("Sell");
//	s.push(10);
//	s.push(20);
//	s.push("Sell");
//	s.push(10);
//	s.push(10);
	
//	System.out.println("Capacity of Stack:"+s.capacity());
//	System.out.print("Stack: ");
//	System.out.println(s);
//	System.out.println("First Element: "+s.getFirst());
//	System.out.println("Last Element: "+s.getLast());
//	System.out.println("Search element: "+s.search(10));
//	Iterator i3 = s.iterator();
//	while (i3.hasNext()) {
//		System.out.print(i3.next() + " ");
//	}
//	System.out.println();
//	//add element using push operation..
//	s.push(10);
//	s.push(20);
//	s.push("Sell");
//	System.out.println(s);
//	//Remove element(From the top of the stack bcz its follow the last in First out )
//	s.pop();
//	System.out.println(s);
//	//see the last element 
//	System.out.println("Top Element of Stack: "+s.peek());
//	System.out.println(s);
//	System.out.println("Index of 10: is"+s.get(10));

}

}
