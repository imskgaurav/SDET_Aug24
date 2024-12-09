package com.javaPractice.testprograms;

public class CharInAlphabetic_AscOrder_BubbleSort {
    public static void main(String[] args) {
        
        String s= "naukrijob";
        String sort=sortCharUsingBubbleSort(s);
        System.out.println(sort);
    }

    public static String  sortCharUsingBubbleSort(String a){
      char arr[]= a.toCharArray();
      int len= arr.length;

      for(int i =0; i< len; i++){
        for(int j =0; j<len-i-1;j++){
            if(arr[j] >arr[j+1]){
                //swap the char
                char temp= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }
       
      }



      return new String(arr);

    }

}
