package org.java.MoveZero;

import java.util.Arrays;

public class MoveZeroAtEnd {

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
     int res []=   moveZero2End(nums);
        System.out.println(Arrays.toString(res));
    }
    static int [] moveZero2End(int arr[]){
        int len = arr.length;
        int insertPosition =0;
       for(int i=0; i<len; i++){
           if(arr[i]!=0){
               arr[insertPosition]= arr[i];
               insertPosition++;
           }
       }
       while(insertPosition<len){

           arr[insertPosition]=0;
           insertPosition++;
       }


     return arr;
    }
}
