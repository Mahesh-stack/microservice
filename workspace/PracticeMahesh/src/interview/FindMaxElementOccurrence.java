package interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaxElementOccurrence {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "banana", "apple","orange");

        String a = "abcd";
        Map<Character, Integer> as = new HashMap<>();
        char[] d = a.toCharArray();

        for (char ch : d){
            if (!as.containsKey(ch)){
                as.put(ch,1);
            } else {
                as.compute(ch, (k, val) -> val + 1);
            }
        }

        System.out.println(as);

        System.out.println(as);

        Collections.reverse(fruits);
        System.out.println(fruits);

        List<String> rev = fruits.stream().map(map-> new StringBuilder(map).reverse().toString()).toList();
        System.out.println(rev);

        Map<String, Long> fru = fruits
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        fru.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });

        Optional<Map.Entry<String, Long>> high = fru.entrySet().stream().max(Map.Entry.comparingByValue());

        high.ifPresent(ent -> {
            System.out.println(ent.getKey());
            System.out.println(ent.getValue());

        });
    }
}
