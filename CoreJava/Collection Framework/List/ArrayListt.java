package com.Listss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayListttt {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		// add
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(5);
		System.out.print("ArrayList: ");
			System.out.println(al);
		// remove even
System.out.print("REMOVE EVEN: ");
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			if (itr.next() % 2 == 0) {
				itr.remove();
			}
		}

		System.out.println(al);
		
		
		//array  to arraylist
		
		Integer arr[]= {50,10,30,40,20};
		List<Integer> ll = new ArrayList(Arrays.asList(arr));
		System.out.print("ArrayList: ");
		System.out.println(ll);
		
		
		//max and min element 
		
		Integer a= Collections.max(ll);
		System.out.println("MAX element: "+a);
		Integer b= Collections.min(ll);
		System.out.println("MIN ELement: "+ b);
		
		
		//sort
		Collections.sort(ll);
		System.out.print("Sort: ");
		System.out.println(ll);
		
		
		//ReverseOrder
		
		Collections.sort(ll,Collections.reverseOrder());
		
		System.out.print("Reverse: ");
		System.out.println(ll);
		
		//remove Duplicate
		
				
	}
	
	
	
	

}
