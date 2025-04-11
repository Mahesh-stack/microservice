package com.micro.discovery;

import java.util.*;

public class Duplicates {

    public static void main(String[] args) {
        int[] arr = {10, 11, 13, 14, 18, 10, 18};

        HashSet<Integer> hset = new HashSet<>();
        //duplicates
        Arrays.stream(arr).forEach(value -> {
            if (!hset.contains(value)) {
                hset.add(value);
            } else {
                System.out.println("Duplicate Element's are ::" + value);
            }
        });

        System.out.println("------------------------------------------");

        //occurrence
        HashMap<Integer, Integer> hmap = new HashMap<>();

        int length = arr.length;
        int i = 0;
        while (i < length) {
            if (!hmap.containsKey(arr[i])) {
                hmap.put(arr[i], 1);
            } else {
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            }
            i++;
        }
        hmap.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });
        System.out.println("------------------------------------------");

        //highestElement
        Optional<Integer> highestElement = Arrays.stream(arr)
                .boxed()
                .max(Integer::compareTo);
        highestElement.ifPresent(System.out::println);
        System.out.println("------------------------------------------");

        //secondHighestElementL
        Optional<Integer> secondHighestElement = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst();

        secondHighestElement.ifPresent(System.out::println);
        System.out.println("------------------------------------------");

        //lowestElement
        Optional<Integer> lowestElement = Arrays.stream(arr).boxed().min(Integer::compareTo);
        lowestElement.ifPresent(System.out::println);
        System.out.println("------------------------------------------");
        Optional<Integer> lowestSecondElement = Arrays.stream(arr).distinct().boxed().skip(1).findFirst();
        lowestSecondElement.ifPresent(System.out::println);
        System.out.println("------------------------------------------");

        List<Integer> list = Arrays.stream(arr).distinct().boxed().sorted((a, b) -> b - a).toList();
        System.out.println(list);

    }
}
