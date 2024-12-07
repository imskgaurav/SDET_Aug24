package com.coreJava.InterviewPrep;

import java.util.Set;

import java.util.LinkedHashSet;

public class RemoveDuplicatesCharInString {

 static String str= "geeksforgeeks";
 static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) {
    //Using LinkedHashSet 
    Set<Character> set1= new LinkedHashSet<>();

    for(int i =0; i<str.length(); i++){
       char c = str.charAt(i);
       set1.add(c);
    }
System.out.println(set1);
 

  for(char c: set1){
     sb.append(c);
  }

System.out.println(sb);

//using Java 8 
StringBuilder sbb= new StringBuilder();
str.chars().distinct().forEach(x->sbb.append((char)x));
    
System.out.println(sbb);
  }
}
