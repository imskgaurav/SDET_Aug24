package com.coreJava.InterviewPrep;

import static enums.User.SUSHMA_HM_ADMIN_PRE;

import java.util.Scanner;

public class SplitStringInEqualParts {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Pls enter String");

        String str = sc.nextLine();

        System.out.println("Given String is :"+str);

        int len = str.length();

        System.out.println("Pls enter Number of partian");

        int num = sc.nextInt();
        System.out.println("Total Substring needed is :"+num);

       System.out.println("Lenght of String is:"+len + "Partition needed is:"+num);

      //Legnth of Each SubString //
       int m = len/num;

       if(len%num==0){
        String subString= null;
        System.out.println("Equal Partitioon is Possible");
        for (int i =0; i<len; i++){
             subString = "";
            for(int j =(i*m); j< (i+1)*m; j++){
                 subString = subString+str.charAt(i);
            }
            System.out.println();
            System.out.println("SubStrings are"+subString);
        }
       
       }
       else{
        System.out.println("Partition is NOT possible");
       }


       

        
    }
    
}
