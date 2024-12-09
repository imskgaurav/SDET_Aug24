package org.java.dsaALGO;

public class BubbleSortCode {

    //https://youtu.be/xWLxhF3b5P8 : Telusko Naveen

    public static void main(String[] args) {

        int arr[] = { 64,25,70, 32, 22, 90,11 };
        bubbleSortAlgo(arr);

    }

    public  static  void bubbleSortAlgo(int [] arr){

        int len =arr.length;
        int temp=0;
       //First For loop is For Initialised the Loop  n times
        for(int i =0; i<len; i++){
            for(int j =0; j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp= arr[j+1];
                     arr[j+1] =arr[j];
                     arr[j] = temp;
                }

            }
            System.out.println("After Each Iteration: ");

            for(int k : arr){

                System.out.print(k +" ");
            }
            System.out.println();
        }

    }
}
