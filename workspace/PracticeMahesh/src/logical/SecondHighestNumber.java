package logical;

import java.util.Arrays;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {
        Integer[] arr = {1, 23, 34, 56, 23, 78, 89};

        Optional<Integer> d = Arrays.stream(arr).sorted((a,b)-> b-a).skip(1).findFirst();
        d.ifPresent(num-> System.out.println(num));

        System.out.println("------------------------------------------");

        Optional<Integer> a = Arrays.stream(arr).max(Integer::compareTo);
        a.ifPresent(num-> System.out.println(num));

        System.out.println("------------------------------------------");

        Optional<Integer> b =  Arrays.stream(arr).min(Integer::compareTo);
        b.ifPresent(num-> System.out.println(num));

        System.out.println("------------------------------------------");


        Optional<Integer> c = Arrays.stream(arr).skip(1).findFirst();
        c.ifPresent(num-> System.out.println(num));





       // Arrays.stream(arr).distinct().sorted((a,b)->b-a).skip(1).findFirst();




/*        Optional<Integer> c = Arrays.stream(arr)
                .distinct()
                .sorted((a, b)->b-a)
                .skip(1)
                .findFirst();

        System.out.println(c);

        c.ifPresent(num -> System.out.println("Second Highest No." +num));

        int highestNumber = Integer.MIN_VALUE;
        for (int a : arr){
            if (a > highestNumber){
                highestNumber = a;
            }
        }
        System.out.println(highestNumber);*/
    }

}
