package org.dsa.leetcode;

public class L151 {
    //https://leetcode.com/problems/reverse-words-in-a-string/

   // Input: s = "the sky is blue"
   // Output: "blue is sky the"

    public static void main(String[] args) {

        String sentence1= "the sky is blue";
        String sentence2= "a good   example";
        String res2= reverseSentences(sentence2);
        System.out.println(res2);

    }

    static String reverseSentences(String inp){
        String [] str= inp.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=str.length-1; i>=0; i--){

            if(!str[i].isEmpty()){

                sb.append(str[i]);
                sb.append(" ");
            }
            else{
                System.out.println("The Str is emty :"+str[i]);
            }
        }



    return sb.toString().trim();
    }
}
