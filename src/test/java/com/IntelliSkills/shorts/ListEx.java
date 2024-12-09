package com.IntelliSkills.shorts;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class ListEx {
    public static void main(String[] args) {

        ArrayList<String> list;
         list = new ArrayList<>();
        list.add("A");
        list.add("E");
        list.add("I");

        System.out.println(list);

        list.add(1, "ONE");

        //""
        System.out.println(list);



    }
}
