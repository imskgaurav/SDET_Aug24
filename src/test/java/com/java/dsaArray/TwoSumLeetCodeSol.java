package com.java.dsaArray;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSumLeetCodeSol {

   // https://www.youtube.com/watch?v=7jDS9KQEDbI
   public static void main(String[] args) {

       int inp[] = {16, 4, 23, 8, 15, 42, 1, 2};

       int target = 19;
       /*crearte a HashMap <Integer, Integrt>  for Arrays Element with array val as keys and Index as HashMap, Value  */

       Map<Integer, Integer> map1 = new LinkedHashMap<>();
        for(int j =0; j<inp.length; j++ ) {
            int complement = target-inp[j];
            if(map1.containsKey(complement)) {
               int index= map1.get(complement);
                System.out.println("Found in HashMap with Index :"+index);
                System.out.println("Array Index is :" +j);
            }
            map1.put(inp[j], j );

            }
       System.out.println(map1);
        }

   }

