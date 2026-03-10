package com.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class HashSett {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();    
        // Properties of HashSet:
        // - Insertion order is NOT preserved
        // - Duplicates are NOT allowed
        // - Single null value is allowed

        // Adding elements
        hs.add(30);
        hs.add(10);
        hs.add(null);
        hs.add(20);
        hs.add(10); // duplicate, ignored
        hs.add(40);

        System.out.println("HashSet elements: " + hs);

        // Demonstrating some HashSet methods
        System.out.println("Contains 20? " + hs.contains(20));   // true
        System.out.println("Is HashSet empty? " + hs.isEmpty()); // false
        System.out.println("Size of HashSet: " + hs.size());     // number of unique elements

        hs.remove(30); // remove element
        System.out.println("After removing 30: " + hs);

        // Convert HashSet to List for iteration with ListIterator
        List<Integer> li = new ArrayList<>(hs);

        ListIterator<Integer> itr = li.listIterator();
        System.out.println("\nForward Iteration:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nBackward Iteration:");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        // Clear all elements
        hs.clear();
        System.out.println("\nAfter clear(), HashSet: " + hs);
    }
}
