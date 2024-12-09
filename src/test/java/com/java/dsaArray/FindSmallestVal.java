package com.java.dsaArray;

public class FindSmallestVal {

    public static void main(String[] args) {
     int arr[] = {80, 89,-8, 84,87 };
           int min =findSmallestNumber(arr);
        System.out.println(min);
    }

    public static int findSmallestNumber(int input[]){

        int min = input[0];

        for (int j =1; j<input.length; j++){

            if(input[j] <min){

                min = input[j];
            }
        }

        return  min;
    }
}

