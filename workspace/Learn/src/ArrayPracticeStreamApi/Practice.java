package ArrayPracticeStreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.OptionalInt;

public class Practice {
    public static void main(String[] args) {
        int arr[] = {10,25,76,54,23,56,76};

        OptionalInt res = Arrays.stream(arr).sorted().max();
        System.out.println(res);
    }
}
