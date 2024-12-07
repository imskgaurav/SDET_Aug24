package com.coreJava.InterviewPrep;

public class Pattern1 {


    

    public static void main(String[] args) {


       char last = 'E';
        char start = 'A';

        char alphabet = 'A';
      for(int i =1; i<=(last-start+1); i++){


        //System.out.println(i);

        for (int j =1; j<=i; ++j ){

            System.out.print(" "+alphabet);
        }
        ++alphabet;
        System.out.println();
      }
        
    }
    
}
