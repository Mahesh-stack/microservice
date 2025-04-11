package ArrayPracticeStreamApi;

import java.util.Arrays;
import java.util.OptionalInt;

public class HighestNumberInArray {

    public static void main(String[] args) {
        int arr[] = {10,25,76,54,23,56,76};
        OptionalInt number = Arrays.stream(arr).sorted().min();
        System.out.println(number-> System.out.println(num));
    }
}
