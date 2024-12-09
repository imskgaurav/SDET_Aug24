package com.java.dsaString;


import java.util.Arrays;

public class LargestNumber_L179 {

    //https://www.youtube.com/watch?v=eGNnQNn2I0M

    public static void main(String[] args) {
       int [] arr = {6, 88, 19,7};
        String str=largestNumber(arr);
        System.out.print(str);
    }

    static String largestNumber(int num[]){

       String [] numArr= new String[num.length];

       for(int i =0; i<numArr.length; i++){

          numArr[i] = String.valueOf(num[i]);
       }
        System.out.print("String Array  is:"+ Arrays.toString(numArr));
       Arrays.sort(numArr, (a,b)->(b+a).compareTo(a+b));
        System.out.print("Sort Array  is:"+ Arrays.toString(numArr));
        StringBuilder result = new StringBuilder();
        for(String s: numArr){
            result.append(s);
        }

    return result.charAt(0)=='0'? "0":result.toString();

    }
}
