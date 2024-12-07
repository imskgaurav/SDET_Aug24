package com.coreJava.InterviewPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CountOfEachCharacter {


public static void main(String[] args) {


    String sen= "Hi Shashikant Sai";

    countCharcarcterFromGivenString(sen);
    
}


public static void countCharcarcterFromGivenString(String input){


    Map<Character,Integer> hm = new LinkedHashMap<Character, Integer>();

    //charArarry 

    char chArr[] = input.toCharArray();


      for(Character c:chArr){

        if(hm.containsKey(c)){

            hm.put(c, hm.get(c)+1);
        }
        else{

            hm.put(c,1);
        }


      }


      System.out.println(hm.toString());

      Set<Character>set = hm.keySet();

      for(Character c: set){

    System.out.println("Key is:"+c +"& The Value is :"+hm.get(c));

      }


      

      

}

    
}
