package com.java.princeAutomation;

public class ReverseOnlyAlphabets {


    public static void main(String[] args) {
        String s1 = "34auto35qa@sdet?25years";
        //output = 340otua35qa@teds?25sraey
        String rev= "";
        StringBuilder sb = new StringBuilder();
        char [] chArr = s1.toCharArray();
           for(char c : chArr){
               if(Character.isAlphabetic(c)){
                   System.out.println("Char is alphabets:"+c);
                 sb.append(c);
                   System.out.print("New StringBuilder is :"+sb);
               }else{
                   System.out.println("Char is Not alphabets::"+c);
              StringBuilder sb1=  reverseStringBuilder(sb);
                  rev = rev+sb1+c;
                   System.out.println("after Reversing and Adding char"+sb);
                   sb.setLength(0);
               }
           }
           reverseStringBuilder(sb);
        System.out.print("Outside For Loop:"+sb);
        System.out.print("Collector  String :"+rev);
    }

   static  StringBuilder reverseStringBuilder(StringBuilder sb){
        return sb.reverse();
         /*sb.setLength(0);*/
       //System.out.print("New StringBuilder :"+sb);
    }
}
