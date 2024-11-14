package com.java.ReProgram;



import org.checkerframework.checker.units.qual.C;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CompressString {
   static String str = "aaabbbccccccccccccccccc";
    //output : a3b3c2
    //using HashMap:
    public static void main(String[] args) {

        Map<Character, Integer> cMap = new LinkedHashMap<>();

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            System.out.print(c);
            if (!cMap.containsKey(c)) {
                 cMap.put(c, 1);
            } else {
                cMap.put(c, cMap.get(c)+1);
            }

        }
        System.out.print(cMap.toString());
      String compress = "";
        for( Map.Entry<Character, Integer> entry: cMap.entrySet()){

            char c= entry.getKey();
            int val = entry.getValue();
            System.out.println("key is :"+ c);
            System.out.println("value is :"+val );

      compress= compress+c+val ;


        }
        System.out.println(compress);


    }
}
