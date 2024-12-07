package com.coreJava.InterviewPrep;

import java.util.Map;
import java.util.HashMap;

//https://www.youtube.com/watch?v=pyt-RGt7slA
public class TwoSumArrayProb {

    public static void main(String[] args) {
        
        int [] nums = {6,5,3,0,9};//
    
       //Using Brute FORCE appraoch
        int target =9;
        for(int i =0; i<nums.length;i++){
            for (int j =i+1; j<nums.length-1; j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("value of i "+i);
                    System.out.println("value of j "+j);
                    break;
                }
            }


        }
       //uSING hashMap :
    }

    public static void findTheTwoSumArray(){
        int inp[] = {16, 4, 23, 8, 15, 42, 1, 2};

        int tar=12;

        Map<Integer, Integer> map1= new HashMap<>();

        //

        for(int i=0; i<inp.length; i++) {

            int comp= tar-inp[i];
            if(map1.containsKey(inp[i])){

               int index1= map1.get(comp);

               int index2=i;

           

            }
            else{

                map1.put(inp[i], i);
            }
        }


       }





}
