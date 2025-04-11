package logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 10, 30};

        Set<Integer> set = new HashSet<>();
        Set<Integer> s = new HashSet<>();
        Arrays.stream(arr).forEach(s::add);
        System.out.println(s);

       /* for (int i = 0; i <= arr.length-1; i++) {
            if (set.contains(arr[i])) {
                System.out.println(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }*/
    }
}
