package org.dsa.leetcode;

import java.sql.SQLOutput;

public class printRoman {

    public static void main(String[] args) {

        int []num = {1000, 900, 500, 400,100, 90, 50, 40, 10,9,5,4,1};
        String sym[] = {"M", "CM", "D","CD", "C", "XC",
                "L","XL","X","IX", "V", "IV", "I"};
        //System.out.println(num.length);
        //System.out.println(sym.length);
        int val=2994;
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<num.length;i++){
                while(val-num[i]>=0){
                val= val-num[i];
                    System.out.println("New Value is :"+val);
                System.out.println("Corresponding VALUE of nums[i] is:"+sym[i]);
                sb.append(sym[i]);
            }

        }
        System.out.println(sb);


    }
}
