package interview;

public class Sample {

    public static void main(String[] args) {

        int[] arr = {10, 15, 47, 14, 88};

        int j = 0;
        int k = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > j) {
                j = arr[i];//10,15,47,14,88
                if (k < j) { //10,15,47,
                    k = arr[i];
                }
            }
        }
        System.out.println(k);
    }
}

