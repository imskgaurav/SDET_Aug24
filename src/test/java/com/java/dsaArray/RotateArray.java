package com.java.dsaArray;

import java.util.Arrays;

public class RotateArray {

    //Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4]
    // Explanation:
    //rotate 1 steps to the right: [7,1,2,3,4,5,6]

    //Solutions :
    //1st Step : REVERSE complete array : [7,6,5,4,3,2,1]
    //2nd Steps : Consider Reverse Array in two parts : 0 to k-1: :: it will be 5,6,7 :

    public static void main(String[] args) {
        int num []= {1,2,3,4,5,6,7};
        reverseArr(num, 3);
        //rotateArrayByKSteps(numb,3);
        // Call twice the same Function//




    }
    public static  void rotateArrByKthPlace(int [] arr, int start, int end){
        //int start =0;
        //int end= arr.length-1;
        while(start<end){
           int temp=arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;

        }
        System.out.print("Reverse Array is :"+ Arrays.toString(arr));
    }

    public static void reverseArr(int [] arr, int k) {
        rotateArrByKthPlace(arr, 0, arr.length - 1);
        rotateArrByKthPlace(arr, 0, k-1);
        rotateArrByKthPlace(arr, k, arr.length-1);
        // 2nd Step : leave the Array from 0 t0 k-1 Index as its , Reverse from k to length-1
    }

}
