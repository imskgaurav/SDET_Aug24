package com.coreJava.dheeruMundluru;
//https://www.youtube.com/shorts/pXj1pf-13b0
public class PassByValueExample {

   static void modify(int x) {
        x = 10;  // Changes    the local copy
    }

    public static void main(String[] args) {
        int num = 5;
        modify(num);
        System.out.println(num);  // Output: 5 (unchanged)
    }
}