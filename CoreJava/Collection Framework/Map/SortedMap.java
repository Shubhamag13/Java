package com.mapp;
import java.util.SortedMap;
import java.util.TreeMap;

public class SorteddMap {

	
	    public static void main(String[] args) {
	        SortedMap<Integer,String> s = new TreeMap<>();
	        		s.put(10, "Vansj");
	        		s.put(9, "Vass");
	        		s.put(11, "vassssssss");
	        		System.out.println(s);
	        		
	        		System.out.println(s.firstKey());
	        		System.out.println(s.lastKey());
	        		
	        		System.out.println(s.firstEntry());
	        		System.out.println(s.lastEntry());
	    }
	}
