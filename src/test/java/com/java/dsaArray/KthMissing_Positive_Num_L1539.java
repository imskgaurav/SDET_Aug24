package com.java.dsaArray;

public class KthMissing_Positive_Num_L1539 {

    public static void main(String[] args) {

       int [] arr = {2,3,4,7,11};
       int k =5;
       /* Output: 9
        Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...].
        The 5th missing positive integer is 9. */

        int nums [] = new int[11];
        /* using Frequency Array*/
        for(int i =0; i<arr.length; i++){
            int val =arr[i];
            nums[val-1] = nums[val-1]+1;
        }
       int count =0;
    for(int x: nums){
        count++;
        System.out.println(x);
        if(x==0){

            System.out.println("Missing Number is:"+count);
        }
    }

    }
}
