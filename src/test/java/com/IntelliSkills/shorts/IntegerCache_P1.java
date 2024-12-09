package com.IntelliSkills.shorts;

public class IntegerCache_P1 {

  // integer cache store the integer Val from -128 to 127  range
    //if any Value found in above range, the same address is assigned for duplicate val
    public static void main(String[] args) {
     Integer a = 100;
     Integer b = 100;

     // The below Integer in not in Integer Cache
     Integer c= 199;
     Integer d = 199;

        System.out.println(a==b);
        System.out.println(c==d);

    }
}
