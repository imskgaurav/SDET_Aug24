package com.java.stringConcept;

public class StringSplitForSpecialCharacter {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
////Output: str = “much.very.program.this.like.i”
// Split the String using .
        StringBuilder sb = new StringBuilder();
        String [] arr= str.split("\\.");
        System.out.println(arr.length);
        //System.out.println(arr[0]);
        for(int i =arr.length-1; i >=0; i--){
            sb.append(arr[i]);
            sb.append(".");
        }
        System.out.println(sb.substring(0,sb.length()-1));


    }
    }

