package com.java.dsaArray;

import java.util.Arrays;

public class MoveAllZeroAtEndOfArray {

    public static void main(String[] args) {

        int arr[] = {12,0,6,0,7,5,0,9};
        int position =0;

        for(int i =0; i<arr.length; i++){
            // Focus on NonZero first//
            if(arr[i]!=0){
                arr[position] = arr[i];
                position++;
            }
        }

        while(position<arr.length){
            arr[position] =0;
            position++;

        }

        System.out.println(Arrays.toString(arr));
    }
}
