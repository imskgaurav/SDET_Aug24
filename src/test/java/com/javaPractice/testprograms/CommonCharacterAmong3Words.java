package com.javaPractice.testprograms;

public class CommonCharacterAmong3Words {


    public static void main(String[] args) {
      String com = "";  
    String s1= "feminismo";
    String s2= "polymorphism";
    String s3= "thyodism";

    /*Step1 : Change Larger String to charArray  */

    for( char c: s2.toCharArray()){

        if((s1.indexOf(c)!=-1) &&(s2.indexOf(c)!=-1) && (s3.indexOf(c)!=-1)){

           System.out.println("Char is common Among All Three String :"+c);
           if(!com.contains(String.valueOf(c))){
           com= com+c;
           }
        }
    }
    System.out.println(com);


}
}