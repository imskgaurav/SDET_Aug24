package com.javaPractice.testprograms;

import java.util.Arrays;

public class FindLargestNumFromArray {

    public static void main(String[] args) {
        int [] arr = {22,44, 88, 777, 0,55};
        int max=findLargestNumberFromArray(arr);
        System.out.println("The max Value is :"+max);

     int xx=   findKthLargestVal(arr, 3);


     System.out.println(xx);
        
    }

    public static int findLargestNumberFromArray(int arr[]){
      int maxVal=0;
      int len = arr.length;
      if(len>=2){
         System.out.println("Assume the First value is Latrge");
        maxVal = arr[0];
      for(int i =1; i<len;i++){

        if(maxVal<arr[i]){

            maxVal=arr[i];
        }
    }
    System.out.println("Max Value is:"+ maxVal);
    }
      return maxVal;
    }

     public static int findKthLargestVal(int arr[], int k){
        int kthLargest=0;
       if(k <arr.length){

        Arrays.sort(arr);
        kthLargest=  arr[arr.length-k];
       }else{

        System.out.println("Index is Out of Array");
       }

   
      
    return kthLargest;
     }

    
}
