package com.java.patternDurgesh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAllDigitsFromString {
  // https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
    public static void main(String[] args) {

        String str = "wkandjkasd._823723%";

       StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("\\d+");
        Matcher matcher= p.matcher(str);
        if(matcher.find()){

            System.out.println(matcher.start());
            System.out.println(matcher.end());
            //System.out.println(matcher.group());
            sb= sb.append(matcher.group());
            System.out.println(sb);
        }
    }
}
