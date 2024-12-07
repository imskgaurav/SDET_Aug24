package com.coreJava.InterviewPrep;

import java.util.Arrays;
public class SortingArrayAscDescOrder {

    public static void main(String[] args) {

        int [] input= {8,9, 2,4, 6,3,8, 5};
    
      //System.out.println(Arrays.toString(sortArrayInDesc(input)));
      sortArrInAscOrder(input);

        
    }


    public static int [] sortArrayInDesc(int inp[]){

 
      for (int i =0; i<inp.length; i++){
   int temp =0;
        for(int j =i+1; j<inp.length; j++){
            if(inp[i]<inp[j]){
               temp =inp[j];
              inp[j] =inp[i];
                inp[i] = temp;
            }
            


        }
       
      }

      System.out.println(Arrays.toString(inp));
        
       return inp;
    }

  public static void sortArrInAscOrder(int [] input){
    
    for(int i =0; i<input.length; i++){
       int temp =0;
        for(int j =i+1; j<input.length;j++){
            if(input[i]>input[j]){
                temp= input[j];
                 input[j] = input[i] ;    
                 input[i] = temp;
            }
        }
    }

   System.out.println(Arrays.toString(input));

  }


  
}
