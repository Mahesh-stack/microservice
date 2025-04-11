package com.micro.discovery;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesArrayList {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 10, 15, 20, 45, 24, 78, 99, 20, 1);

        Optional<Integer> max = a.stream().sorted().max(Integer::compareTo);
        max.ifPresent(System.out::println);
        System.out.println("-----------------------------");

        Map<Integer, Long> collect =
                a.stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);



    }
}
