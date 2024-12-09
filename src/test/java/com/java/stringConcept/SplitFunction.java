package com.java.stringConcept;

public class SplitFunction {


    public static void main(String[] args) {
        String s = "  Hello  Coder ";
      String words[]=  s.split(" ");
      for(String str:words){

          if(str.isEmpty()){
              System.out.println("Empty String Found"+str);
          }else{

              System.out.println("non Empty String :"+str);
          }
      }
    }
}
