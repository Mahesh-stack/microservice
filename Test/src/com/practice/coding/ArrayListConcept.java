package com.practice.coding;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

    public static void main(String[] args) {
        //ArrayListConcept a1 = new ArrayListConcept();

        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add("Mahesh");
        a1.add(null);
        a1.add(10);
        a1.add("A");
        a1.add(10l);

        Iterator iterator = a1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        a1.forEach(a -> {
            if (a == "Mahesh"){
                System.out.println(a);
            }
            System.out.println(a);
        });

       /* a1.add(3,"Mahesh");
        System.out.println(a1);
        a1.remove(3);
        System.out.println(a1);

        a1.removeIf(o -> (boolean) (o = 10));
        System.out.println(a1);*/
    }
}
