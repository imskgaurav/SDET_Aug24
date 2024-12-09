package com.coreJava.InterviewPrep;

public class EqualPartitionOfString {


    public static void main(String[] args) {
           divideStringInEqualParts("programin", 3);
    }


    public static void divideStringInEqualParts(String str, int n){
       String s = " ";
       if(str.length()%n!=0){
        System.out.println("Partition NOT possible");
        return;
       }
       else{
         int parts= str.length()/n;

           for(int i=1; i<=str.length(); i++){
             s = s+str.charAt(i-1);
               if(parts%i==0){
                System.out.println(s);
                 System.out.println();
           }
       
        }
    }

    

    }
}