package com.java.dsaString;

public class L54_ReverseWords {

    public static void main(String[] args) {
        String s = "the sky is blue";
        //OutPut : "blue is sky the"
        String rev=revWords(s);
        System.out.println(rev);
        String wordsRev=reverseTheOrderOfWords(s);
        System.out.println(rev);
    }

     public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
       return sb.reverse().toString();
     }
    public static  String revWords(String inp){
        String rev= "";
      if(inp.length()==0){
          return null;
      }
      String words[]= inp.split(" ");
      for(int i =0; i<words.length; i++){
          if(words[i].length()!=0){
            rev= rev+reverseString(words[i]+" ");
          }else{
              System.out.println("Ignoring the Spaces");
          }

      }
      return rev;
    }

    public static String reverseTheOrderOfWords(String s1){
        StringBuilder sb = new StringBuilder(s1);
        int start = 0;
        int end =s1.length()-1;

        while(start<end){
           char c1= sb.charAt(start);
           char c2=sb.charAt(end);
           char temp = c1;
            c1=c2;
            c2=temp;
            start++;
            end--;

        }
        return sb.toString();
    }

}
