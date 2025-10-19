package org.java.dsaTwoPointer;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

//https://www.geeksforgeeks.org/problems/special-array-reversal2328/1
public class SpecialArrReversal {
    /*Input: S = "A&x#
  Output: "x&A#"
   Explanation: we swap only A and x.
    * */
    public static void main(String[] args) {
        String res = ArrayReversal("A&xU#E");
        System.out.println(res);
    }

    static String ArrayReversal(String str) {
        //String res = "";
        char ch[] = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if(!Character.isLetter(ch[left])){
                System.out.println("Special Char Found, Move the left Pointer");
                left++;
            }
            else if(!Character.isLetter(ch[right])){
                System.out.println("Move Right pointer");
                right--;
            }
            else{
                // Swap only Alphabet Character
                 char temp = ch[left];
                   ch[left]=ch[right];
                   ch[right]= temp;
                 left++;
                 right--;
            }




        }
        return new String(ch);
    }
}