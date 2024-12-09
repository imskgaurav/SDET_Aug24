package org.java.efficientSol;

import java.util.Arrays;

public class SingleForLoop_Sorting {
   //  https://www.youtube.com/watch?v=TmqJSD-CJKY

    public static void main(String[] args) {
        int arr[] = { -7, 2, 99, 9, 8, 67, 6, 0, 5, 4, 3 };

        for(int i =0;i<arr.length-1; i++){

            if((arr[i] >arr[i+1])){

                int temp=arr[i+1];
                arr[i+1] =arr[i];
                arr[i] =temp;
                i =-1;
            }
            System.out.println(Arrays.toString(arr));

        }


    }
}
