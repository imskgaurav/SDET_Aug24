package com.java.dsaString;

public class LeetCodeWeeklyAssesment1 {

    //https://leetcode.com/assessment/1
    /*Given a string s and an integer k,
    reverse the first k characters for every 2k characters counting from the start of the string.
    If there are fewer than k characters left, reverse all of them.
    If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
    Example 1:Input: s = "abcdefg", k = 2
    Output: "bacdfeg"
    Example 2:Input: s = "abcd", k = 2
    Output: "bacd"  */

    public static void main(String[] args) {
        String str = "abcdefg";
        String res= "";
        int k = 2;
        for(int i =0; i<str.length()-1; i++) {
             res = res+swapChar(str, i, i+1);
        }
        System.out.println(res);
    }

    private static String swapChar(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        char c1=sb.charAt(i);
        char c2= sb.charAt(j);
        sb.setCharAt(i,c2 );
        sb.setCharAt(j,c1);
        System.out.println(sb);
        return sb.toString();
    }




}
