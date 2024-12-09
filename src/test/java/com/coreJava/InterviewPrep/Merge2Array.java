package com.coreJava.InterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Merge2Array {
    public static void main(String[] args) {
        
           String str1[] = { "A", "E", "I" };           
           String str2[] = { "O", "U", "B"};   
          List<String> l1= new ArrayList<>(Arrays.asList(str1));
          List<String> l2= Arrays.asList(str2);
           l1.addAll(l2);
           System.out.println(l1);//

          // Sorting // 
          Collections.sort(l1);
          System.out.println(l1);

    // mereg two int arr

    int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9};

        int arr3[] = new int[arr1.length+arr2.length];

        System.arraycopy(arr1,0,arr3,0,arr1.length);

        System.out.println(Arrays.toString(arr3));
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        System.out.println(Arrays.toString(arr3));
    }

}
