package com.coreJava.dheeruMundluru;

import static  java.lang.System.out;
public class Recursion {

    public static void main(String[] args) {

        int fact =factorial(5);
       out.print("Factorial is :" +fact);

    }

    static int factorial(int n) {
        if (n==0) {
          return 1;
        }
           out.print("value of n :" + n);
            return n * factorial(n - 1);
        }
    }

