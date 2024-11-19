package com.selenium.questions;

public class Public_SAP_Q1 {

    public static void main(String[] args) {
        String inp ="deepa*%$#@";
        String chStr= "";
        String spChar= "";
        String outPut= "";

       // @a#p$e%e*d
        char ch[] = inp.toCharArray();
        for(char c: ch){
            if(Character.isAlphabetic(c)){
                chStr= c+chStr;

            }else{
                spChar= c+spChar;
            }
        }
        System.out.println(chStr);
        System.out.println(spChar);
        for(int i=0; i<chStr.length(); i++){

                outPut = outPut + chStr.charAt(i) + spChar.charAt(i);

        }

        System.out.println(outPut);

    }



}
