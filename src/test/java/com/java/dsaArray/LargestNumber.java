package com.java.dsaArray;


import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();

        String arr[] =  {"11", "33"};

        Arrays.sort(arr, new LargestNumComparator());

        System.out.print(Arrays.toString(arr));
    }
    private static class LargestNumComparator implements Comparator<String> {

        @Override
        public int compare(String a, String b) {
            String o1= a+b;// 1133
            String o2= b+a;// 3311
            return o2.compareTo(o1);
        }
    }
}
