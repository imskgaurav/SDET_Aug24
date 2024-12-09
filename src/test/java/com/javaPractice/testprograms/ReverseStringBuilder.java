package com.javaPractice.testprograms;

public class ReverseStringBuilder {

    public static void main(String[] args) {
        

        StringBuilder sb = new StringBuilder("hello");
         int len = sb.length();
        for(int i =0; i<(len/2); i++){
             int front= i;

            int back = len-1-i;  
            char frontChar= sb.charAt(front);
            char backChar= sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);



        }
      System.out.println(sb);


    }
    
}
