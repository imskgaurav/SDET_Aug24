package com.java.dsaString;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LargestCommonString {

    public static void main(String[] args) {
        String str1 = "ABCDGH", str2 = "ACDGHR";
        Set<String> set1 = findSubStringCombination(str1);
        System.out.println(set1);
        Set<String> set2 = findSubStringCombination(str2);
        System.out.println(set2);
        //  Intersection pf 2 sets :

        set1.retainAll(set2);
        System.out.println("common Elemnent:"+ set1);

      Iterator<String> itr = set1.iterator();
      while(itr.hasNext()){
          String s1= itr.next();

          int len= s1.length();
          System.out.println(len);

      }


    }

    private static Set<String> findSubStringCombination(String str){

        //String str1 = str;
        Set<String> subStr1= new LinkedHashSet<>();
        //make SubString from both str1 & str2
        for(int i =0; i<=str.length(); i++) {
            for(int j =i+1; j<str.length();j++){
                String sub1 = str.substring(i,j);
                System.out.println(sub1 );
                subStr1.add(sub1);
            }

        }
     return  subStr1;
    }
}
