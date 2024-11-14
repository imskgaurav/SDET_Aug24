package com.binarySearchBased.prob;

public class Find_NumberOfZero {

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 0, 0};

        int totalZeo =findZeroIndexes(arr);
        System.out.println(totalZeo);

    }

  static int  findZeroIndexes(int [] arr){
    int len= arr.length;
    int count=0;
        for(int i=0; i<len; i++){
            if(arr[i]==0){
            count++;

            }

        }
        if(count >1) {
            return count;
        }
        else {

            return -1;
        }
  }

}


