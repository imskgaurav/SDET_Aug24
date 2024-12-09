package com.enumdemo.java;

public class EnumDemo {

    public static void main(String[] args) {

        Day monday = Day.MONDAY;
        int index=monday.ordinal();
        System.out.println("index is :"+index);
        System.out.println(monday.getClass());
        Day tuesday = Day.TUESDAY;
        
        //if u want name as String
        String name1=tuesday.name();
        System.out.print(name1.toLowerCase());







    }
}
