package com.java.ReProgram;

public class ReverseString {


    public static void main(String[] args) {


        String str=revString("ORCHIDS");
        System.out.printf(str);

    }
    public static String revString(String str){
        String rev = "";

        for(int i =str.length()-1; i>=0; i--){

            rev = rev+str.charAt(i);
        }
     return rev;
    }
}
