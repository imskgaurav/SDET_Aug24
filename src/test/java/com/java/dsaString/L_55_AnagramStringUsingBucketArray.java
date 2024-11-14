package com.java.dsaString;


public class L_55_AnagramStringUsingBucketArray {

    /*dormitory : dirty room**/

    public static void main(String[] args) {
       boolean res= checkIfTwoStringAnagram("acer", "race");
       System.out.println(res);

    }
    static boolean checkIfTwoStringAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
          return false;
        }
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        //Create a int array for 26 char

        int counts[] = new int[26];

        int len= str1.length();
        // Fill the BucketArray for the occurrence of Char of str1//
        for(int i=0; i<len; i++){
          // Find the Difference of Char value with reference with 'a', and put that on the same index(diff value)
          // Default value of Array is 0 at each Index;so make it 1 once its visited;
            int val = str1.charAt(i)- 'a';
            counts[val] = counts[val]+1;
        }

        // Empty the BucketArray for the occurrence of Char of str2//
        for(int j =0; j<len; j++){
          int val = str2.charAt(j)-'a';
          counts[val] = counts[val]-1;
        }

        //Check if All Bucket are EMPTY
         for( int a  :counts) {
          if(a!=0){
              System.out.println("NOT ANAGARM");
           return false;
          }

         }
        System.out.println("Found Anagram");
    return true;
    }


}
