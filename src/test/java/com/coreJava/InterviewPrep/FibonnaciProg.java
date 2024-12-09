package com.coreJava.InterviewPrep;
//Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
// firsr term =0, second term =1; 
// next term = fisrt+2md (0+1) ;> 1
///first term =second
// secondterm = nextTerm 
//
public class FibonnaciProg {


    public static void main(String[] args) {

        int nextTerm =0;
        int f1 = 0;
        int f2= 1;

        for(int i=0; i<10; i++){
            System.out.print(f2+ " ");
           nextTerm= f1+f2;
              f1= f2;
             f2= nextTerm;
            
        }
        
    }
}
