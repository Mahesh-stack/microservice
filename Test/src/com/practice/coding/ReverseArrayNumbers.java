package com.practice.coding;

public class ReverseArrayNumbers {
    public static void main(String[] args) {
        int arr[] = {1,23,56,7,9,23,5};
        int highest = 0;
        int secondHighest = 0;
        for (int i = arr.length-1; i >= 0; i--){
            int num = arr[i];
            if (num > highest){
                secondHighest = highest;
                highest = num;
            } else if (highest > secondHighest && highest < secondHighest) {
                secondHighest = num;
            }
        }
        System.out.println(secondHighest);

    }
}
