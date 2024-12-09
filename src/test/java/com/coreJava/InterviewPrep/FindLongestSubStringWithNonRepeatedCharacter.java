package com.coreJava.InterviewPrep;

import java.util.*;

public class FindLongestSubStringWithNonRepeatedCharacter {

    public static void main(String[] args) {
        
        Map<Character, Integer> hmap = new LinkedHashMap<>();
        String s1= "GEEKSFORGEEKS";

        for(int i =0; i<s1.length(); i++){

              char c=s1.charAt(i);

              if(!hmap.containsKey(c)){

                hmap.put(c, i);

              }
              else{
               System.out.println("Duplicate Found");
               i = hmap.get(c);
                hmap.clear();
              }
        }
        System.out.println(hmap);

         String nonRepeatingChar =hmap.keySet().toString();
         System.out.println(nonRepeatingChar);
        
    }

}
