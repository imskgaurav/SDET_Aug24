package com.java.dsaString;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FindPresenceOfSubString {


    public static void main(String[] args) {

        // boolean f1 = checkSubStringPresenceWith_IndexOf("Naveen Automation lab", "lab");
        //System.out.println(f1);
        checkSubStringInGivenInputUsingRegEx("Java Program Coder", "Coder");
    }

    public  static boolean  checkSubStringPresenceWith_IndexOf(String input, String subStr){
        boolean res= false;

        if(input.indexOf(subStr)!=-1){
             res = true;
            System.out.println("SubString is Present in Given Input String");
         return res;
        }else{

         return res;
        }

    }

    public static boolean checkSubStringInGivenInputUsingRegEx(String inp,String subStr){
        Pattern p =Pattern.compile(subStr);
        Matcher m= p.matcher(inp);
        System.out.println(m.find());
        String s = m.group();
        System.out.println("string is :"+s);
        return  true;
    }
}
