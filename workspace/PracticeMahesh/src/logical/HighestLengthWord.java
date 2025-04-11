package logical;

public class HighestLengthWord {

    public static void main(String[] args) {

        String words = "My Name is Mahesh";

        String[] word = words.split(" ");

        String longestWord = "";

        for (String a : word) {
            if (a.length() > longestWord.length()) {
                longestWord = a;
            }
        }
        System.out.println(longestWord);
    }
}
