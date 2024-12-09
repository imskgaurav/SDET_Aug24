package com.java.dsaString;


///https://leetcode.com/problems/reverse-string-ii/description/
public class L541_ReverseString_FirstKChar {
    public static void main(String[] args) {
        String s= "abcdefg";  //Output: "bacdfeg"
        int k = 2;
        ///char chArr[] = s.toCharArray();
        StringBuilder sb1 =new StringBuilder( s.substring(0,2));
        StringBuilder sb2= new StringBuilder( s.substring(2,s.length()-1));

      String res= reverseString(sb1)+sb2;

        System.out.print("Result is :"+ res);



    }

    static  String reverseString(StringBuilder s){
        int len = s.length();
        StringBuilder rev = new StringBuilder();
        for (int j= len-1; j>=0; j--){
            rev.append(s.charAt(j));
        }
      return rev.toString();
    }
}
