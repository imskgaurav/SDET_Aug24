package com.java.array_shasCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateInArray_442 {
   // 442. Find All Duplicates in an Array
    //Given an integer array nums of length n
    // where all the integers of nums are in the range [1, n] and each integer
    // appears at most twice, return an array of all the integers that appears twice.
   /* Example 1: Input: nums = [4,3,2,7,8,2,3,1]   Output: [2,3] */

    //[4,3,2,7,8,2,3,1]   :
    // 4-1 =3 Find the 3rd Index value and make it negative
    //3-1=2 , Find the 2nd Index Value and make it Negative

    public static void main(String[] args) {
         int nums [] = {4,3,2,7,8,2,3,1};
      List<Integer> res=findDuplicate(nums);
        System.out.println("Duplicate Result"+res);
    }

     public static List<Integer> findDuplicate(int [] nums){
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            //Find the Element first

            int elm = Math.abs(nums[i]);
            int seat = elm-1;
            if(nums[seat]<0){

                System.out.println("Duplicate Elm Found ,add it to list");
                arr.add(elm);

            }
            else{
                nums[seat] = -nums[seat];
            }

        }

     return arr;
     }


}
