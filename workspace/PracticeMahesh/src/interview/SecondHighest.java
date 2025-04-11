package interview;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHighest {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(10, 12, 15, 47, 89, 12, 58, 69, 35);

        List<Integer> list = listOfIntegers.stream().sorted().toList();

        for(Integer i : list){


        }

        int secondLowest = list.get(1);
        int secondHighest = list.get(list.size()-2);
        System.out.println(secondLowest);
        System.out.println(secondHighest);

        Collections.reverse(listOfIntegers);
        System.out.println(listOfIntegers);

        String[] a = {"apple", "banana","apple","orange","grapes","apple","banana"};

        Map<String, Long> map = Arrays.stream(a).collect(Collectors.groupingBy(b->b,Collectors.counting()));
        map.forEach((word,count)-> {
            if (count>1){
                System.out.println(word+"="+count);
            }
        });

        /*Optional<Integer> high =
                listOfIntegers.stream().max(Integer::compareTo);
        high.ifPresent(num -> System.out.println("Highest number :: " + num));

        Optional<Integer> lowest =
                listOfIntegers.stream().min(Integer::compareTo);
        lowest.ifPresent(num -> System.out.println("Lowest number :: " + num));

        Optional<Integer> secLow =
                listOfIntegers.stream().skip(1).findFirst();
        secLow.ifPresent(num -> System.out.println("Second lowest number :: " + num));

        Optional<Integer> sechigh =
                listOfIntegers.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst();
        sechigh.ifPresent(num -> System.out.println("Second highest number :: " + num));*/
    }
}
