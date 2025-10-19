package com.java.dsaString;

public class BasicConcept1_subArrayFromString {

    //String s = "abc";   sub Array from this String

    public static void main(String[] args) {
        String str = "abc";
        for(int i=0; i<str.length(); i++){
            //System.out.println(str.substring(i,i+1));
            for(int j =i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }

    }
}
