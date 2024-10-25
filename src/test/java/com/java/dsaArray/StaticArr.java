package com.java.dsaArray;


import java.util.Arrays;

public class StaticArr {

    static int [] arr;
    static int[] arr1= {4,5,6};
    public StaticArr(){
     arr=arr1;
     arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

    }

    public static void main(String[] args) {
        StaticArr obj = new StaticArr();

        System.out.println(Arrays.toString(obj.arr));
    }
}
