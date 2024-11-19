package com.geeksforgeeks.solutions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PalindromeArrays {

    //https://www.youtube.com/watch?v=a7br6oJT2cA

   // https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=2&difficulty=Basic&sortBy=submissions
    public static void main(String[] args) {

        int arr[] = {111, 222, 333, 444, 555};
        int arrA[]= {258952, 3693, 1471, 7417, 58585};
        boolean res=IspalindromeArray(arrA);
        System.out.println();
        System.out.println("PalinDrome :"+res);
    }

    public static boolean IspalindromeArray(int[] arr) {
        // add code here.
        boolean val =false;
        for(int a: arr ){
            String str=String.valueOf(a);
            StringBuilder sb = new StringBuilder(str);
            val=isPalindromeVal(sb);
            if(val==false){

                break;
            }
        }
        System.out.print("The First String PalinDrome Val is :"+val);

        return val;
    }

    static boolean isPalindromeVal(StringBuilder sb) {
        boolean isTrue = true;
        int low = 0;
        int high = sb.length() - 1;
        while (low <=high) {
            Character c1 = sb.charAt(low);
            Character c2 = sb.charAt(high);
            System.out.println("c1 is:"+c1);
            System.out.println("c2 is:"+c2);
            System.out.println("***Compare Both Char++++");
             boolean b=c1.equals(c2);
            System.out.println(">>>");
            if (b==false) {
                System.out.println("Found false");
                isTrue=false;
                break;
            }
            low++;
            high--;
        }
        return isTrue;
    }

}