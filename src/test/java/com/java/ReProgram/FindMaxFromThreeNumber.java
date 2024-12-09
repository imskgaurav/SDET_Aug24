package com.java.ReProgram;

public class FindMaxFromThreeNumber {

    public static void main(String[] args) {

      int max=  findMaxFromGivenThreeNumber(9,-67, 8);
        System.out.println(max);


    }

    static int findMaxFromGivenThreeNumber(int a, int b, int c){

        int res= Math.max(c,Math.max(a,b));
        return res;
    }
}
