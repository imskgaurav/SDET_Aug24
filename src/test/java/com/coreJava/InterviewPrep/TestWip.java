package com.coreJava.InterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestWip {


    public static void main(String[] args) {

        String input="My Name Name Is Is Aug Aug"; 

           String strArr[] = input.split(" ");

        Set<String> set = new LinkedHashSet<>();
           for(String s: strArr){
             
        set.add(s);

           }
           

           System.out.println(set.toString());

           List<String> res= new ArrayList<>();
           res.addAll(set);

           System.out.println(res);
           
    }
    
}
