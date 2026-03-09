package com.Queue;

import java.util.PriorityQueue;

public class PriorityyQueue {
    public static void main(String[] args) {
        // PriorityQueue properties:
        // - Implements Queue interface
        // - Internally uses a Min-Heap (smallest element at head by default)
        // - Orders elements by natural ordering or custom Comparator
        // - Null elements NOT allowed
        // - Duplicates allowed

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(26);
        pq.add(96);
        pq.add(54);
        pq.add(23);
        pq.add(1);
        pq.add(40);

        System.out.println("PriorityQueue elements (heap order): " + pq);

        // element() vs peek()
        // element() → returns head, throws exception if empty
        // peek()    → returns head, returns null if empty
        System.out.println("Head using element(): " + pq.element());
        System.out.println("Head using peek(): " + pq.peek());

        // poll() vs remove()
        // poll()   → removes head, returns null if empty
        // remove() → removes head, throws exception if empty
        pq.poll();
        pq.remove();

        // remove(Object o) → removes specific element if present
        pq.remove(54);

        System.out.println("PriorityQueue after removals: " + pq);

        // Iteration (not guaranteed to be sorted order, only heap order)
        System.out.println("\nIterating PriorityQueue:");
        for (Integer val : pq) {
            System.out.println(val);
        }
    }
}
