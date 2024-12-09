package com.java.ReProgram;



public class FindAllSubString_FromGivenInput {

    public static void main(String[] args) {
        //Using Brute Force Approach, And SubString method//
      //https://www.youtube.com/watch?v=I1rgYRi1tXE
       String lang= "python";
       int len = lang.length();

       for (int i=0; i<lang.length(); i++){

           for(int j=i+1; j<=len; j++){

               String sub=lang.substring(i,j);
               System.out.println(sub+ " ");

           }
       }


    }


}
