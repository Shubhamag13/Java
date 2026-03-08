package com.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayyDeque {
    public static void main(String[] args) {
        // ArrayDeque properties:
        // - Implements Deque (double-ended queue)
        // - Insertion order is preserved
        // - Faster than Stack and LinkedList for stack/queue operations
        // - Null elements NOT allowed

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // Adding elements
        ad.add(50);
        ad.add(60);
        ad.add(12);
        ad.add(10);
        ad.add(100);
        System.out.println("Initial ArrayDeque: " + ad);

        // Add element at First
        ad.addFirst(50);
        System.out.println("After addFirst(50): " + ad);

        // Add element at Last
        ad.addLast(110);
        System.out.println("After addLast(110): " + ad);

        // Peek methods
        System.out.println("Peek First: " + ad.peekFirst());
        System.out.println("Peek Last: " + ad.peekLast());

        // Poll methods (remove and return head/tail)
        System.out.println("Poll First: " + ad.pollFirst());
        System.out.println("Poll Last: " + ad.pollLast());
        System.out.println("After polling: " + ad);

        // Iterate in reverse order using descendingIterator
        System.out.println("\nReverse Iteration:");
        Iterator<Integer> itr = ad.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
