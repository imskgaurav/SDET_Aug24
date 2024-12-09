package com.coreJava.InterviewPrep;

public class FactorialsCalc {

    public static void main(String[] args) {

        long xx=factorial(12);
        System.out.println(xx);
        
    }
    public  static long factorial(int num){
          if(num==1){

            return 1;
          }
        return  num*factorial(num-1);  
    } 
}
