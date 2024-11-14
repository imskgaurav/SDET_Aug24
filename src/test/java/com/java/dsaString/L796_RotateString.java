package com.java.dsaString;

public class L796_RotateString {
    // Find the rotate String is correct are Not ?///
    // input =abcde and goals = cdeab///
    public static void main(String[] args) {
    rotateString("miami", "");


    }

    public static boolean rotateString(String input, String goal){
         if(input.length()!=goal.length()){
             return false;
         }
        return (goal+goal).contains(input);
    }


}
