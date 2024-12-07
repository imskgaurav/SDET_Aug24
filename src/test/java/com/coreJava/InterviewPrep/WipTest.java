package com.coreJava.InterviewPrep;

public class WipTest{

    public static void main(String[] args) {
        

        String str = "My Name Name Is Is Aug Aug";

        System.out.println(str.length());

        String arr [] = str.split(" ");
         String res="";
        for(int i=0; i<arr.length; i++){

               ///System.out.print(arr[i]);

               char ch[] = arr[i].toCharArray();

             res = res+ch[0]+ ch[ch.length-1];

             

             System.out.println(res);


        }



    }
    
}
