package com.java.dsaArray;

import java.util.Arrays;

public class Merge2Array {

    public static void main(String[] args) {
        // The two original arrays
        int[] array1 = {10, 20, 30};
        int[] array2 = {40, 50};
        //Create a new Array  which can hold both
        int [] mergeArr = new int[array1.length+array2.length];
        //Insert 1st ARRAY in newly created Array
        for(int i=0; i<array1.length; i++){
            mergeArr[i]= array1[i];
        }
        //Now insert the second Array, in the remaining  index  ::
        for(int i=0; i<array2.length; i++){
            mergeArr[array1.length+i]= array2[i];
        }
        Arrays.stream(mergeArr).forEach(System.out::println);


    }
}
