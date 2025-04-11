package com.practice.arraylist;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestElementInArrayList {

    public static void main(String[] args) {

        List<Integer> arrays = Arrays.asList(10, 20, 30, 50, 80, 100, 50, 60);

        Optional<Integer> max = arrays.stream().max(Integer::compareTo);
        System.out.println(max.get());

        Optional<Integer> secMax = arrays.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
        secMax.ifPresent(System.out::println);

        Optional<Integer> min = arrays.stream().min(Integer::compareTo);
        min.ifPresent(System.out::println);

        Optional<Integer> secMin = arrays.stream().sorted().skip(1).findFirst();
        secMin.ifPresent(System.out::println);

    }
}
