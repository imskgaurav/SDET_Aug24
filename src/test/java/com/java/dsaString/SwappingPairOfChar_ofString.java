package com.java.dsaString;

public class SwappingPairOfChar_ofString {
    /*   the task is to write a Java program to swap the pairs of characters of a string. If the string contains an odd number of characters
       then the last character remains as it is.*/
       static String str = "Java";

    //output : aJaV
    public static void main(String[] args) {

     swapCharPairs(str);
     swapCharPairsUsingStringBuilder(str);
    }

    static void swapCharPairs(String str) {
      /*Step1: CHANGE to charArray
      *  Step2 : Iterate Array Till the length ,
      * by jumping 2 char each Time
      *  Step3 : Create a temp Variable and Swap the char */
       char chArr[]= str.toCharArray();

       for(int i=0; i<str.length(); i=i+2){
           char temp= chArr[i] ;
           chArr[i] = chArr[i+1];
           chArr[i+1]=temp;
       }
        System.out.println(chArr);
        /*System.out.println(str)  Immutability of String*/;

    }

    static void swapCharPairsUsingStringBuilder(String inp){

        StringBuilder sb = new StringBuilder(inp);
        System.out.println(sb);
        for(int i=0; i<sb.length(); i=i+2){
             char c1= sb.charAt(i);
             char c2= sb.charAt(i+1);
             char temp= c1;
              sb.setCharAt(i, c2);
              sb.setCharAt(i+1, temp);
        }
        System.out.println(sb.toString());
    }
}
