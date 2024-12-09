package prog.test.practices;

import java.util.ArrayList;
import java.util.Collections;
import  java.util.List;

public class LeetCode_151_ReverseWord {

    public static void main(String[] args) {

        System.out.println(reverseWords("    Hello!    Mumbai Team"));
    }

    public static String reverseWords(String str) {

        String[] parts = str.split(" ");
         for(String s: parts){

             System.out.print(s);
         }
        List<String> li = new ArrayList<String>();
        //System.out.print("New String :"+parts[0] + parts[1]+parts[1]);
        for (String word : parts) {
            if (!word.isEmpty()) {

                li.add(word);
            }
            System.out.println(li);


        }
        Collections.reverse(li);
        System.out.println("Collection Reverse id DONE");
        System.out.println(li);
        return String.join(" ", li);
    }
}

