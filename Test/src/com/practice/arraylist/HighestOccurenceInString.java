package com.practice.arraylist;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestOccurenceInString {
    public static void main(String[] args) {
        List<String> arr = List.of("Sam","Joe","Jack","James","Dan","Sam","Joe");

        Map<String, Long> map = arr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map.forEach((key, value) -> System.out.println(key + "=" + value));

        System.out.println("---------------------------");

        Optional<Map.Entry<String, Long>> maps = map.entrySet().stream().max(Comparator.comparingLong(Map.Entry::getValue));
        maps.ifPresent(System.out::println);
    }

}
