package com.java.patternDurgesh;

import java.util.Arrays;
//https://www.youtube.com/shorts/nMBTr3DKJDo
//When you run this code, you won't see [2, 4, 5] printed out. Instead, you'll see something like [I@15db9742.
//This happens because in Java, arrays are objects. When you pass an array directly to System.out.println,
// it calls the default toString() method, which prints the memory address (or more accurately, the class name + the hashcode) rather than the contents. //
public class Ex2 {

    public static void main(String[] args) {
        int [] arr = {2,4,5};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
         String [] str = {"PUNE", "MUMBAI"};
        System.out.println(str);
    }
}
