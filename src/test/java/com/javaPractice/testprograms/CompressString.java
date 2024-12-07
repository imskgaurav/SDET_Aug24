package com.javaPractice.testprograms;

import java.util.HashMap;

import java.util.*;

public class CompressString {

    //aaabbbcc into a3b3c2 in java

    public static void main(String[] args) {

      String str = "aaabbbcc";

      Map<Character, Integer> map1= new HashMap<>();

      for (int i =0; i<str.length(); i++){
      char c = str.charAt(i);

      if(map1.containsKey(c)){
      map1.put(c, map1.get(c)+1);
      }
      else{
        map1.put(c, 1);


      }

      }

      System.out.println(map1);

      map1.forEach((key,value)->System.out.print(key+""+value));
        
    }
    
}
