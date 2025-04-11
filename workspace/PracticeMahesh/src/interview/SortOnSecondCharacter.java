package interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortOnSecondCharacter {

    public static void main(String[] args) {
        String[] name = {"Alice","Bob","Charlie","David","Frank","Alice","Frank","Alice"};

        List<String> sort = Arrays.stream(name).sorted(Comparator.comparing(s -> s.charAt(1))).toList();
        System.out.println(sort);

        Map<String,Long> map = Arrays.stream(name).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map.Entry<String,Long> highElement = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(highElement);

        map.forEach((k,v)-> {
            System.out.println(k+"="+v);
        });

        String a = "MaheshMah";
        char[] ch = a.toCharArray();
        Map<Character, Integer> m = new HashMap<>();
        for (char c : ch){
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        System.out.println(m);
    }
}
