package com.coreJava.InterviewPrep;

public class Swap2String {

public static void main(String[] args) {

    String s1 = "Hello";

    String s2 = "World";

    s1= s1+s2;
    System.out.println(s1);// s1= HelloWorld;
    
    s2 = s1.substring(0, s1.length()-s2.length());///

    System.out.println(s2);//s2=s1;

    s1=s1.substring(s2.length());
    System.out.println(s1);

   //SWAP without using 3rd Variable 


      int x=5;
      int y=10;


     x= x+y;

     y =x-y;
     x=x-y;
     
   System.out.println("Value of x"+x);    
   System.out.println("Value of y"+y);  

}
}