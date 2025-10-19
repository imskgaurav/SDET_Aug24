package com.java.dsaStack;

public class Stack1 {
//Set condition
    int top =-1;
     int arr[] = new int [5];

   void push(int x){

       if(top==arr.length-1){
           return;
       }
          arr[++top] =x;
    }

    int pop(int x){
       if(top==-1){
           System.out.println("no element");
           return -1;
       }
     return arr[top--];

    }


}
