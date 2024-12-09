package com.javaPractice.testprograms;

public class RemoveDuplicateCharacterFromString {

    public static void main(String[] args) {
        
      String str = "IINDIAA  BHHAARAT";

      char prev = ' ';

      String finalStr= "";

{
      for(int i =0; i<str.length(); i++){


           char c= str.charAt(i);

           if(prev!=c){

            finalStr+=c;
            prev= c;

           }
    

      }
      System.out.println(finalStr);

    }
}
}
