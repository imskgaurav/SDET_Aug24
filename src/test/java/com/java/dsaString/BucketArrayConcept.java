package com.java.dsaString;

public class BucketArrayConcept {


    public static void main(String[] args) {

        // Ascii value of A is : 65
        //Ascii value of a is : 97
        createBucketArrayForAllAlphabets("dormitory");


    }

    public static void createBucketArrayForAllAlphabets(String str1){
        str1= str1.toLowerCase();
        //initialsed Bucket Array
        int [] counts = new int[26];

        for(int i=0; i<str1.length(); i++){

           //counts[str1.charAt(i) - 'a']++;// counts[3] = count[3]+1;
            int x= str1.charAt(i) - 'a';
            counts[x]= counts[x]+1;


        }

       for(int x: counts){
           System.out.println(x);
       }


    }
}
