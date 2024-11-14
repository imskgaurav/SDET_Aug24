package com.java.dsaString;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class L51_FindAllSubStringOfString {

    public static void main(String[] args) {
        String str = "abc";
        String s1= "ADFHI";

        //   abc :  a, ab, abc :: b, bc , c :  n(n+1)/2
        // a : subString(0,1) , ab : (0,2), abc: (0,3)
        // b : subString(1,2) , bc : (1,3)
        //c : (2,3)

       // printAllSubStrings(str);
        printAllSubStrings(s1);

    }

    public static void printAllSubStrings(String input){

        int len= input.length();
        System.out.print("Lenght is "+len);

        // start Index
        for(int startIndex=0; startIndex<len; startIndex++){
            System.out.println();
            for(int j =startIndex+1; j<=len;j++ ){

                String res= input.substring(startIndex, j);
                System.out.print(res+ " ");

            }

        }


    }
}
