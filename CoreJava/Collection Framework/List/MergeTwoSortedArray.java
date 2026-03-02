package com.Listss;

import java.util.ArrayList;

public class MergeTwoSortedArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(50);

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(20);
        al1.add(40);
        al1.add(60);

        ArrayList<Integer> merged = new ArrayList<>();

        int i = 0, j = 0;

        // Merge process
        while (i < al.size() && j < al1.size()) {
            if (al.get(i) < al1.get(j)) {
                merged.add(al.get(i));
                i++;
            } else {
                merged.add(al1.get(j));
                j++;
            }
        }

        // Add remaining elements
        while (i < al.size()) {
            merged.add(al.get(i));
            i++;
        }

        while (j < al1.size()) {
            merged.add(al1.get(j));
            j++;
        }

        System.out.println("Merged Sorted ArrayList: " + merged);
    }
}
