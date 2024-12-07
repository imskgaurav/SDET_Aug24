package com.coreJava.InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharInString {

  public static void main(String[] args) {
    
    int index =-1;
    Map<Character, Integer> freqMap= new HashMap<>();
    String input = "lotsoflove";
    for(int i =0; i<input.length(); i++){

            char c =input.charAt(i);

            int freq= freqMap.getOrDefault(c, 0);

            System.out.println(freq);

          freqMap.put(c,(freq+1));
    }
     System.out.println("Iterating HashmAP");     
    for(int j =0; j<input.length(); j++){

                int x=freqMap.get(input.charAt(j));

                if(x==1){
                 index=j;
                 System.out.println("index is" +index);
                 System.out.println("Char is ;"+input.charAt(index));
                  break;
                }

          }


    }



}
