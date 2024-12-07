package com.javaPractice.testprograms;
/*    
 *****
 *   *
 *   *
 *   *
 *****
   */

   /* rows = col =5; 1st row = 5 And Last rows = 5 star.    */ 
public class HollowSquareStarPattern {
    public static void main(String[] args) {
        int count=5;

        for (int i =1; i<=count; i++ ){
            System.out.println();
           for (int j=1; j<=count; j++)
           if((i==1)||(j==1)||(i==5)||(j==5)){
           System.out.print("*");
           }
           else{
            System.out.print(" ");
           }
           
        }
        System.out.println();    
    }



}
