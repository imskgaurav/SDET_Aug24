package com.java.stringBasics;

public class Lecture48_shashcode1 {

    public static void main(String[] args) {
   int arr[] = new int[3];
   arr[0]=6;
   System.out.println(arr[0]);
   arr[0]=44;
   int brr[] =arr;
   System.out.println(brr[0]);
   brr[0]=-9;
   System.out.println(arr[0]);

    }
}
