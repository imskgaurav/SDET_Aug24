package com.java.dsaString;

public class StringExpansion {


    public static void main(String[] args) {

        String input = "a4b5";
        StringBuilder sb = new StringBuilder();
        String s = "";
        char[] arr1 = input.toCharArray();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (arr1[i] >= 48 && arr1[i] <= 57) {
                char c = arr1[i];
                System.out.println("Char is Digit:" + c);
                int num = Integer.parseInt(String.valueOf(c));
                System.out.println("Digit is:" + num);
                if (count!=num) {
                    s = s + (arr1[i - 1]);
                    System.out.print(s);
                    count++;
                }
                else{
                    System.out.println("out of if Loop");
                }

            }
            System.out.println(s);
        }


    }
}