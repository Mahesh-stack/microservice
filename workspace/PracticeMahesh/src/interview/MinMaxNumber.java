package interview;

import java.util.*;

public class MinMaxNumber {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(10, 12, 15, 47, 89, 12, 58, 69, 35, 10);

        // Find maximum and minimum value in list
        Optional<Integer> max = listOfIntegers.stream().max(Integer::compareTo);
        Optional<Integer> min = listOfIntegers.stream().min(Integer::compareTo);

        max.ifPresent(System.out::println);
        min.ifPresent(System.out::println);

        System.out.println("-----------------------------------------");

        ////Find second lowest and highest in List of Integer
        List<Integer> a = listOfIntegers.stream().sorted().toList();
        System.out.println(a.get(1));
        System.out.println(a.get(a.size() - 2));

        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");


        int[] arr = {10, 12, 13, 15, 117, 56, 75, 100};

        // Find maximum and minimum value
        OptionalInt aa = Arrays.stream(arr).max();
        OptionalInt ab = Arrays.stream(arr).min();

        aa.ifPresent(System.out::println);
        ab.ifPresent(System.out::println);

        System.out.println("-----------------------------------------");

        //Find second lowest and highest in Array
        Arrays.sort(arr);
        System.out.println(arr[1]);
        System.out.println(arr[arr.length - 2]);


        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");


        // Find Duplicates in Array
        Set<Integer> set = new HashSet<>();

        listOfIntegers.stream().forEach(z-> {
            if (!set.contains(z)){
                set.add(z);
            } else {
                System.out.println(z);
            }
        });
        for (Integer c : listOfIntegers) {
            if (!set.contains(c)) {
                set.add(c);
            } else {
                System.out.println(c);
            }
        }

        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

        //Print occurrences
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer c : listOfIntegers) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.compute(c, (k, val) -> val + 1);
            }
        }

        for (Map.Entry<Integer, Integer> data : map.entrySet()) {
            System.out.println(data.getKey() + "=" + data.getValue());
        }
    }
}
