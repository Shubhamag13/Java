package com.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsett {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();    

        // Properties of LinkedHashSet:
        // - Insertion order is preserved
        // - Duplicates are NOT allowed
        // - Single null value is allowed

        // Adding elements
        lhs.add(30);
        lhs.add(10);
        lhs.add(null);
        lhs.add(20);
        lhs.add(10); // duplicate, ignored
        lhs.add(40);

        System.out.println("LinkedHashSet elements: " + lhs);

        // Demonstrating some LinkedHashSet methods
        System.out.println("Contains 20? " + lhs.contains(20));   // true
        System.out.println("Is LinkedHashSet empty? " + lhs.isEmpty()); // false
        System.out.println("Size of LinkedHashSet: " + lhs.size());     // number of unique elements

        lhs.remove(30); // remove element
        System.out.println("After removing 30: " + lhs);

        // Iterating using Iterator
        System.out.println("\nIteration using Iterator:");
        Iterator<Integer> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Clear all elements
        lhs.clear();
        System.out.println("\nAfter clear(), LinkedHashSet: " + lhs);
    }
}
