package com.coreJava.InterviewPrep;

import java.util.Map;
import java.util.HashMap;

import java.util.Arrays;

public class TwoSumArrayHashMapSolution {


    public static void main(String[] args) {
        
        int [] kk= {12,7, 90, 4,15, 89};
       
        int [] res= findIndexInArrays(kk,19);

        System.out.println(Arrays.toString(res));

    }


    public static int [] findIndexInArrays(int inp[], int target){

        int [] index= new int[2];

        Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();

        //ITERATE OVER ARRAY:

        for (int i =0; i<inp.length; i++){

            int comp= target-inp[i];
            if(m1.containsKey(comp)){

                 int mkeys = m1.get(comp);

                 int k= i;
                 index[0]= mkeys;
                 index[1]= k;
            }
            else{

                m1.put(inp[i], i);
            }


        }



        return index;
    }

}
