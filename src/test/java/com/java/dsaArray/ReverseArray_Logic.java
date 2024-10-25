package com.java.dsaArray;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ReverseArray_Logic {

    //IntelliSkills :https://www.youtube.com/watch?v=VpokQuw_lVs

    public static void main(String[] args) {
     int arr [] = {7,8,6,-888, 19,20};
     reverseArrayMethod(arr);
    }

    private static void reverseArrayMethod(int[] arr) {
         int start=0;
         int end= arr.length-1;
          int temp=0;
        while(start<end){
        // swapping Logic //
           temp= arr[start];
           arr[start] = arr[end];
           arr[end]= temp;
           //Now Iterate  the start and end Pointer
            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
