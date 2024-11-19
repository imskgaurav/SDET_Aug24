package com.geeksforgeeks.solutions;

public class StringWithNumber {
//https://www.geeksforgeeks.org/problems/string-with-numbers-at-its-end5749/1?page=1&difficulty=Basic&sortBy=submissions
    public static void main(String[] args) {
        //String with numbers at its end
        String s= "geeks5";
        String s2= "gypgqgr07";
        //Find the String which having only Alphabets// 0, 6
        StringBuilder sb = new StringBuilder(s.substring(0,s.length()-1));
        System.out.println("String with Alphabets:"+sb);
        System.out.print("-----");
        System.out.print("Length of the StringBuilder Object:"+ sb.length());
                                                   //5            //6
        int len=Integer.parseInt(s.substring(s.length()-1, s.length()));
        System.out.print("length:"+len);
        if(sb.length()==len){
            System.out.println("TRUE");
        }
    }
}
