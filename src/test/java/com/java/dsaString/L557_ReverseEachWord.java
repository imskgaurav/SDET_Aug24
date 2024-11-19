package com.java.dsaString;

public class L557_ReverseEachWord {
   // Input : Hello World
    //OUTput : olleH dlroW

    public static void main(String[] args) {
        String words ="Hello World";
     String rev= reverseEachWords(words);
        System.out.print(rev);
    }

    static  String reverseEachWords(String inputString){
        String[] words = inputString.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<words.length; i++){
            String oneWord= words[i];
            System.out.print(oneWord);
            System.out.println("---- ");
            System.out.println("Value of i:"+i);
            for(int j=oneWord.length()-1; j>=0; j--){
                System.out.println("***j**");
                System.out.print("J Value is:"+j);
                System.out.print(oneWord.charAt(j));
                 sb.append(oneWord.charAt(j));
            }
            sb.append(" ");

        }
        System.out.println("After Reverse"+sb.toString());
        return sb.toString().trim();
    }


}
