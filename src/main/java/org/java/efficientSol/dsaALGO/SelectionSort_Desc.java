package org.java.efficientSol.dsaALGO;

import org.openqa.selenium.json.JsonOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort_Desc {

    public static void main(String[] args) {
        int[] arr = {12, 19, 55, 2, 16};
        selectionSortForDescOrder(arr);
        System.out.println("After Sorting the Val");
        Arrays.toString(arr);
    }
   public static  void selectionSortForDescOrder(int a[]){
        int len = a.length;
        int temp =0;
        for(int step=0; step<len-1;step++){
            //assuming the max index is at 0 , index , then at 1
            int max_index=step;
            for(int i= step+1;i<len; i++) {
                System.out.println("Value of inner Loop Index is:"+i);
                if (a[i] > a[max_index]) {
                    //Now Find the Real max Index, after comparing each iteration ;
                    max_index = i;
                    System.out.println("Max index Found::" + max_index);

                }
            }
                //Leave the Inner For Loop after Finding the Index
            // Now swap the value Using Outer Loop
                  temp= a[step];
                  a[step]= a[max_index];
                  a[max_index] = temp  ;
            System.out.println("aFTER swapping Value at Max index :"+ max_index+"is"+a[max_index]);
            }

       System.out.println(Arrays.toString(a));
        }

    }

