package com.javaPractice.testprograms;

import static  java.lang.System.out;

public class Prim_OctaCal {

    public static void main(String[] args) {
    
        int oct = 010;
        int oct2= 022;

       out.println("OCTAL is "+ Integer.toOctalString(oct));

         int res= oct+oct2;
        System.out.println("Result in Decimal is :" +res +"In octal :"+ Integer.toOctalString(res));



    }

}
