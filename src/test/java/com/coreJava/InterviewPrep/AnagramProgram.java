package com.coreJava.InterviewPrep;

import java.util.Arrays;

public class AnagramProgram {

public static void main(String[] args) {

    String s1= "listem";

    String s2= "silent";

     char [] chStr1= s1.toCharArray();

     char [] chStr2= s2.toCharArray();

    boolean res= isAnagram(chStr1, chStr2);

    System.out.println(res);
}


public static boolean isAnagram(char ch1[],  char ch2[]){
   //Check lenght

   if(ch1.length==ch2.length){
      
      Arrays.sort(ch1);
      Arrays.sort(ch2);

    //compare Soored Array 

       int i=0;
      do{
        if(ch1[i]==ch2[i]){
            i++;
          System.out.println("comparing the char "+ch1[i]);
           
            return true;

        }

        else{

          return false;  
        }

        

   }

   while(i==ch1.length);
   

}
return false;
}
}

   

