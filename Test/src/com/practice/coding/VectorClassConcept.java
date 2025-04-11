package com.practice.coding;

import java.util.Vector;

public class VectorClassConcept {
    public static void main(String[] args) {

        Vector<Object> a1 = new Vector<>();
        a1.add(10);
        a1.add("Mahesh");
        a1.add(null);
        a1.add(10);
        a1.add("A");
        a1.add(10L);

        System.out.println(a1);
    }
}
