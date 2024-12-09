package com.javaPractice.testprograms;

public class CharInAlphabetic_DescOrder_BubbleSort {

    public static void main(String[] args) {
        
        String s= "donaldtrump";
        sortCharInDescOrder(s);
        
    }
    public static String sortCharInDescOrder(String str){
     char chArr[] = str.toCharArray();
     int len = chArr.length;

     for(int i =0; i<len-1; i++){
        System.out.println("Pass number :"+i);
        for(int j =0; j<len-i-1; j++){
        if(chArr[j]<chArr[j+1]){
         /// System.out.println("Asceding order is maintain");
           char temp= chArr[j+1];
          chArr[j+1]=chArr[j];
          chArr[j] =temp;
        }
       System.out.println("After "+j+ "Iteration : " + new String(chArr));
        

        }


     }



        return new String();
    }

}
