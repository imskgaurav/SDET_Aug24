package com.java.dsaString;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestSubStringWithNonRepeatedCharacter {

    static  String s= "aabbxyz";
    public static void main(String[] args) {

        Map<Character, Integer> m1 = new LinkedHashMap<>();

        char [] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++){
              char c= arr[i];
            if(!m1.containsKey(c)){
                m1.put(c,i);
            }
            else{
                 i = m1.get(c);
                System.out.println("Repeated Charater Found at insex"+i);
                m1.clear();
            }
        }
        System.out.println(m1);

        String nonRepeatedChar=m1.keySet().toString();
        System.out.println(nonRepeatedChar);


    }
}
