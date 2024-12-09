package com.java.dsaString;

public class ReverseEachWordOfSentence {

    public static void main(String[] args) {
        String input = "The lion ate the lamb";

        String[] arr = input.split(" ");
        StringBuilder sb;
        String rev= "";
        for(String s: arr){
          sb = new StringBuilder(s);
          sb.reverse();

          rev= rev+sb.toString()+" ";
        }
        System.out.println(rev.trim());

    }
}
