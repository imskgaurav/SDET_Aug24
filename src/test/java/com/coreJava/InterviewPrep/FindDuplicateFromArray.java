package com.coreJava.InterviewPrep;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromArray {

    public static void main(String[] args) {
        int []arr = {1,2,3,3,7,8,2};

       findDuplicateFromArr(arr);
        
    }


    public static  void findDuplicateFromArr(int arr[]){

        Set<Integer> set = new HashSet<Integer>();
        for(int i : arr){
        if(!set.add(i)){

            System.out.println("duplicate found:"+i);

        }
    }

    }

}
