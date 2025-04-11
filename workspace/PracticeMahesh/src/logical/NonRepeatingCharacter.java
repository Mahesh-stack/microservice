package logical;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    static String input = "collection";

    public static void main(String[] args) {


        System.out.println(NonRepeatingCharacter.nonRepeatingChar(input));


    }

    private static String nonRepeatingChar(String input) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char value : input.toCharArray()) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        for (Map.Entry<Character, Integer> data : map.entrySet()) {
            if (data.getValue() == 1) {
                return data.getKey().toString();
            }
        }
        return "_";
    }
}

