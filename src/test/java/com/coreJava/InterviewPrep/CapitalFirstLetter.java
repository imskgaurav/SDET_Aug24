package com.coreJava.InterviewPrep;

public class CapitalFirstLetter {

    public static void main(String[] args) {
        String s = "chat masala";

        String res = " "+s.trim();
        for(int i=0; i<res.length(); i++){
           if(res.charAt(i)== ' '){
               res= res.replace(res.charAt(i+1), Character.toUpperCase(res.charAt(i+1)));

           }
        }
        System.out.println(res.trim());



    }
}
