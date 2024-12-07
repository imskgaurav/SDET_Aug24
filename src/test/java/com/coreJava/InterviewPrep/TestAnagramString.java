package com.coreJava.InterviewPrep;
import java.util.Arrays;

public class TestAnagramString {


    public static void main(String[] args) {
        
        boolean res=isAnagram("nitin", "nitin");
        System.out.println(res);
    }

 static boolean isAnagram(String str1, String str2){
    boolean flag = false;

     if(str1.length()!=str2.length())
          return flag;

   ///  char Array 

   char ch1[] = str1.toCharArray();
   char ch2[] = str2.toCharArray();

   Arrays.sort(ch1);
   Arrays.sort(ch2);

      for(int i=0; i<ch1.length; i++){
        if(ch1[i]==ch2[i]){
            flag = true;
        }
        else{
            flag = false;
           return flag; 
        }

      }

   return flag; 
 }

    
}
