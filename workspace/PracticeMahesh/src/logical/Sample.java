package logical;

import java.util.*;

public class Sample {

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.samplest("collect");

    }

    private void samplest(String collect) {

        char[] ch = collect.toCharArray();
        int length = ch.length;

        for(char c : ch){

        }


        Map<Character, Integer> map = new HashMap<>();

        int i = 0;
        while (i != length) {
            if (!map.containsKey(ch[i])) {
                map.put(ch[i], 1);
            } else {
                int old = map.get(ch[i]);
                int newVal = old + 1;
                map.put(ch[i], newVal);
            }
            i++;
        }

        TreeSet<Object> duplicates = new TreeSet<>();
        for (Map.Entry<Character, Integer> data: map.entrySet()){
        duplicates.add(data.getKey());
        }
        System.out.println(duplicates.toString());

    }
}
