package com.javaPractice.testprograms;

public class RecusrionProgram {


 public static void main(String[] args) {

    long val= factorialCal(23);
    System.out.println(val);
    
 }

   static long  factorialCal( int x){
      long res= 0;
    if (x>=1){

       res= x*factorialCal(x-1);
    } else {
       res= 1;
        return res;
    }

   return res;
   }






}
