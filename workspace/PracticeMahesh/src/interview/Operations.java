package interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Operations {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,57,67,42,100,45,90,42);

        //sorted List
        List<Integer> list1 = list.stream().sorted().toList();
        System.out.println(list1);

        int num = list.stream().max(Integer::compareTo).get();
        System.out.println(num);

        HashMap<Integer,Long> map = (HashMap<Integer, Long>) list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        //Maximum occurred number
        Map.Entry<Integer, Long> map1 = map.entrySet().stream().max(Comparator.comparingLong(Map.Entry::getValue)).get();
        System.out.println(map1);




    }
}
