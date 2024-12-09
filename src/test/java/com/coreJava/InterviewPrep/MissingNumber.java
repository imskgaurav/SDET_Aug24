
package com.coreJava.InterviewPrep;
import java.util.logging.*;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {12, 13, 17, 18, 20, 21, 24, 25, 26};
        
        System.out.println("missing numbers");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                System.out.println("" + j);


            }

            System.out.println(Logger.getLogger("Test"));
        }
    }
}