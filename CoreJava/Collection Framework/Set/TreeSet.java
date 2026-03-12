package com.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSettt {
    public static void main(String[] args) {

        // TreeSet properties:
        // - Stores elements in sorted (ascending) order
        // - No duplicates allowed
        // - Null values NOT allowed (NullPointerException)
        // - Internally uses (self-balancing BST)

        TreeSet<Integer> ts = new TreeSet<>();

        // Adding elements
        ts.add(30);
        ts.add(20);
        ts.add(55);
        ts.add(45);
        ts.add(78);
        ts.add(98);
        ts.add(73);
        ts.add(53);
        ts.add(71);
        ts.add(98); // duplicate ignored

        System.out.println("TreeSet elements (sorted): " + ts);

        // First and Last elements
        System.out.println("First element: " + ts.first());   // smallest
        System.out.println("Last element: " + ts.last());     // largest

        // Ceiling & Higher
        System.out.println("Ceiling(99): " + ts.ceiling(99)); // >= 99 → nearest higher
        System.out.println("Higher(20): " + ts.higher(20));   // strictly greater than 20

        // Floor & Lower
        System.out.println("Floor(4): " + ts.floor(4));       // <= 4 → nearest smaller
        System.out.println("Lower(45): " + ts.lower(45));     // strictly less than 45

        // HeadSet & TailSet
        System.out.println("HeadSet(53): " + ts.headSet(53)); // elements < 53
        System.out.println("TailSet(53): " + ts.tailSet(53)); // elements >= 53

        // Iteration in ascending order
        System.out.println("\nAscending Iteration:");
        Iterator<Integer> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Iteration in descending order
        System.out.println("\nDescending Iteration:");
        Iterator<Integer> descItr = ts.descendingIterator();
        while (descItr.hasNext()) {
            System.out.println(descItr.next());
        }
    }
}
