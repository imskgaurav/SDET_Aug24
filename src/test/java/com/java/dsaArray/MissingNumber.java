package com.java.dsaArray;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {12, 13, 17, 18, 21, 24, 25, 26};
        findMissingNumberInArray(arr);
    }
    public static void findMissingNumberInArray(int arr[]){

       if(arr.length>=2){

           for(int i =0; i<arr.length-1; i++){
               int startIndex=i;
               int nextIndex= i+1;
               if(arr[startIndex] <arr[nextIndex]){

                   //find the Answer
                   int x=arr[nextIndex] -arr[startIndex];
                   //used for loop

                   for(int j =1; j<=x; j++){
                       System.out.println();
                       int missingNumber= arr[startIndex]+j;
                       if(missingNumber!=arr[startIndex]&&missingNumber!=arr[nextIndex])
                       System.out.print("Missing number is :"+missingNumber);
                   }

               }
           }

       }
       else{

           System.out.print("Not possible");
       }


    }
}
