package com.coreJava.InterviewPrep;

import org.bouncycastle.jcajce.provider.asymmetric.EC;

public class RunTimeExceptionExm {

    public static void main(String[] args) {
        

        int x=0;

      try{

        int m = 888/x;
      }
      catch(ArithmeticException exception){
      
       throw new RuntimeException();
      }
    }
    
}
