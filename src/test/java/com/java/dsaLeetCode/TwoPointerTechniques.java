package com.java.dsaLeetCode;

public class TwoPointerTechniques {

    public static void main(String[] args) {

        System.out.print(checkIfPalindrome("racecar"));

    }

    public static boolean checkIfPalindrome(String s){
    int left =0;

    int right =s.length()-1;
      while(left<right){

          if(s.charAt(left)!=s.charAt(right)){

              return false;
          }

          left++;
          right--;

      }

        return true;
    }
}
