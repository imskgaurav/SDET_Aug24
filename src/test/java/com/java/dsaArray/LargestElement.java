package com.java.dsaArray;

public class LargestElement {

    public static void main(String[] args) {

        int arr[] = {77,4, 99,199,299};
         int mx= findLargestElement(arr);
        System.out.println(mx);

    }

    public static  int findLargestElement(int arr[]){
        int max= arr[0];
        for(int x: arr){
            if(x>max){

                max=x;
            }

        }
    return max;
    }
}
