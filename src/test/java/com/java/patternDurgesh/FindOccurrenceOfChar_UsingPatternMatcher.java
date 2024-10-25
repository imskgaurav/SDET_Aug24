package com.java.patternDurgesh;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class FindOccurrenceOfChar_UsingPatternMatcher {

   //https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
    public static void main(String[] args) {
        String name = "kamala shanti khandelwal";

        Pattern p = Pattern.compile("l");
         Matcher m = p.matcher(name);
           int count =0;
           StringBuilder sb = new StringBuilder();
         while(m.find()){

             count++;
             System.out.println("Start Index is :"+m.start());
             System.out.println("Ending Index is :"+m.end());

             sb.append(m.group());
         }

        System.out.println("String with Given Char:"+sb);
        System.out.println("Total occurrences of letter  is:"+ count);
    }
}
