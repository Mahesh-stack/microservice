package com.practice.coding;

import java.util.Arrays;
import java.util.HashMap;

public class MapConcept {

    public static void main(String[] args) {
/*        HashMap<String, String> hm = new HashMap<>();
        hm.put("1", "Mahesh");
        hm.put("2", "Surech");
        hm.put("3", "Ram");
        hm.put("4", "Lakshman");
        hm.put("5", "Mahesh");*/

        String[] names = {"Mahesh","Suresh","Ram","Lakshman","Lakshman","Mahesh"};

        HashMap<String, Integer> map = new HashMap<>();
        Arrays.asList(names).forEach(name -> {

            if (map.containsKey(name)){
                int i = map.get(name);
                int a = i + 1;
                map.put(name, a);
            } else {
                map.put(name, 1);
            }
        });

        //map.putIfAbsent("Naresh",4);
        System.out.println(map);
        //map.putIfAbsent("Mahesh",4);
    }
}
