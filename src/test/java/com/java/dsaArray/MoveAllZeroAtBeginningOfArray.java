package com.java.dsaArray;

import java.net.BindException;
import java.util.Arrays;

public class MoveAllZeroAtBeginningOfArray {


    public static void main(String[] args) {
        int arr[] = {12,6,0,7,0,5,0,9};
        // Start from End Index and check for Nonzero
        int count = arr.length-1;
        for(int i =arr.length-1; i>=0; i--){
            if(arr[i] !=0){
               arr[count]= arr[i];
               count--;
            }

         }
         while(count>=0){

             arr[count]= 0;
             count--;
         }
       System.out.println(Arrays.toString(arr));



    }
}
