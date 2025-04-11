package com.practice.coding;

import java.util.HashMap;
import java.util.Map;

public class DuplicateAlphabets {

    public static void main(String[] args) {
        String alph = "intelligent";

        char[] ch = alph.toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        int i = 0;

        while(ch.length !=  i){
            if(!map.containsKey(ch[i])){
                map.put(ch[i],1);
            } else {
                int oldVal = map.get(ch[i]);
                int newVal = oldVal + 1;
                map.put(ch[i], newVal);
            }
            i++;
        }

        for (Map.Entry<Character, Integer> data : map.entrySet()){
            if (data.getValue()>1){
                System.out.println(data.getKey()+"="+data.getValue());
            }
        }

    }
}
