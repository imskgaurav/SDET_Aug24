package com.java.dsaString;

import javax.print.DocFlavor;

public class L52_ReverseString {

    public static void main(String[] args) {

        // String ss = "HJKLM"; String res = ""; res = ss.CharAt(0)+res;
        String rev= reverseStringUsingCharAtFunction("manmohan");
        System.out.println(rev);

        rev= revByCharSwappingUsingStringBuffer("PYTHON");
        System.out.println(rev);

    }


    static String reverseStringUsingCharAtFunction(String inp){
        String res = "";
        for(int i=0; i<inp.length(); i++){
            /* Empty String need to be added at the End */
            res= inp.charAt(i)+res;
            System.out.println(res);
        }
     return res;
    }

    //https://www.youtube.com/watch?v=m9QAjIVnmp4&t=16s
    static String revByCharSwappingUsingStringBuffer(String str){

       //First Convert String into StringBuilder //
        StringBuilder sb = new StringBuilder(str);
        int len = sb.length();
        //Two pointer Swapping Technique. We have to iterate n/2 only
        //Find first char and last Char , swap them by moving Forward the first char pointer
        //& moving back the Second Pointer Character
        //SetCharAt method of StringBuilder
        for(int i=0; i<len/2; i++){

        char first= sb.charAt(i);
        char last = sb.charAt(len-1-i);
           //Seting
           sb.setCharAt(i,last);
           sb.setCharAt(len-1-i,first);

        }
        return sb.toString();
    }
}
