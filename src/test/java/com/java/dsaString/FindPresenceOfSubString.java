package com.java.dsaString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPresenceOfSubString {


    public static void main(String[] args) {

        boolean f1 = checkSubStringPresence("Naveen Automation lab", "labss");
        System.out.println(f1);
    }

    static boolean checkSubStringPresence(String inp, String subStr) {
        boolean flag = false;

        Pattern p = Pattern.compile(subStr);
        Matcher m = p.matcher(inp);
        if(m.find()){
            System.out.println(m.start());
            System.out.println(m.end());
          flag =true;
        return flag;
        }

      return flag;
    }


}