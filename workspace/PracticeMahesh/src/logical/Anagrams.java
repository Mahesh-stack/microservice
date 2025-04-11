package logical;

import java.util.Arrays;

public class Anagrams {
    static String s1 = "listen";
    static String s2 = "silent";
    public static void main(String[] args) {
        System.out.println(Anagrams.isAnagram(s1,s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()){
            return false;
        }
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}
