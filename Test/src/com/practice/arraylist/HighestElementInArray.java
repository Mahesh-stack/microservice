package com.practice.arraylist;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class HighestElementInArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 10};

      /*  //Highest Element in array
        OptionalInt val = Arrays.stream(arr).max();
        System.out.println(val.getAsInt());

        //Second Highest Element in array
        Optional<Integer> v = Arrays.stream(arr).distinct().boxed().sorted((a, b) -> b - a).skip(1).findFirst();
        v.ifPresent(System.out::println);

        //Lowest  Element in array
        OptionalInt sec = Arrays.stream(arr).min();
        System.out.println(sec.getAsInt());

        //Second Lowest Element in array
        Optional<Integer> c = Arrays.stream(arr).distinct().boxed().sorted().skip(1).findFirst();
        c.ifPresent(System.out::println);*/


        OptionalInt value = Arrays.stream(arr).max();
        System.out.println("The Highest value is ::" + value.getAsInt());

        System.out.println("-------------------------------");

        Optional<Integer> v1 = Arrays.stream(arr).boxed().sorted((a, b)->b-a).skip(1).findFirst();
        System.out.println("The Second Highest value is ::" +v1.get());

        System.out.println("-------------------------------");

        int firstMax = Integer.MIN_VALUE;
        int secondMax= Integer.MAX_VALUE;

        for (int num : arr){
            if (num > firstMax){
                secondMax = firstMax;
                firstMax = num;
            }
        }
        System.out.println(firstMax);
        System.out.println(secondMax);


    }
}
