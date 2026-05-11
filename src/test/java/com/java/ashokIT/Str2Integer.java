package com.java.ashokIT;

public class Str2Integer {

    public static void main(String[] args) {
      int res=    convertStrToInt("9879232384");
        System.out.println(res);
    }

    static int convertStrToInt(String str) {
        int num = 0;
        for (int i =0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int digit = ch-'0';
            System.out.println(digit);
            num = num*10+digit;
        }
       if(num<=Integer.MAX_VALUE){
           return num;
         }else{
              return -1;
            }
    }
}