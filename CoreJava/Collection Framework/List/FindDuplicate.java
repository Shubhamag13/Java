package com.Listss;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(10);
        al.add(40);
        al.add(20);
        al.add(30);

        ArrayList<Integer> al1 = new ArrayList<>();

        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i).equals(al.get(j))) {
                    if (!al1.contains(al.get(i))) {
                        al1.add(al.get(i));
                    }
                }
            }
        } 

        System.out.println("Duplicate elements: " + al1);
    }
}
