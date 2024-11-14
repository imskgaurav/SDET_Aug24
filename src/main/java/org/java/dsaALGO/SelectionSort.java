package org.java.dsaALGO;

import java.util.Arrays;

public class SelectionSort {
 //https://www.programiz.com/dsa/selection-sort
     /*selectionSort(array, size)
        for i from 0 to size - 1 do
            set i as the index of the current minimum
        for j from i + 1 to size - 1 do
            if array[j] < array[current minimum]
        set j as the new current minimum index
        if current minimum is not i
        swap array[i] with array[current minimum]
        end selectionSort*/
    public static void main(String[] args) {
        int a[] = { 80, 10, 29, 11, 8, 30, 15 };
        int[] data = { 20, 12, 10, 15, 2 };
        selectionSort(data);
        System.out.println(Arrays.toString(data));

    }

    public static void selectionSort(int [] arrA){
        int len = arrA.length;
        int temp =0;
        for(int step=0;step<len-1; step++){
         //Assume the min_index is : 0, then 1, and so on..
         int min_index=step;
            for(int j =step+1;j<len;j++){
                // Select the minimum element in each loop.
                // SINCE there we found minIndex is Not what we assume /
                    if(arrA[j]<arrA[min_index]){
                    min_index=j;
                }

            }
            // put min at the correct position
            temp= arrA[step];
             arrA[step]=arrA[min_index];
            arrA[min_index]=temp;

        }

    }
}
