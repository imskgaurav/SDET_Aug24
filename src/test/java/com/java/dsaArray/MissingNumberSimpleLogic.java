package com.java.dsaArray;

public class MissingNumberSimpleLogic {

    public static void main(String[] args) {

        int[] arr = {12, 13, 15, 17, 20, 21, 24, 25, 26};

        for(int i =0; i<arr.length-1; i++){

            for(int j = arr[i]+1; j<arr[i+1]; j++){
              //j=18  j<20
                System.out.println("");
                System.out.print("Missing Number is :" +j);

            }
        }
    }
}
