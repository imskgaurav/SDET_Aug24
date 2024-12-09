package com.java.stringConcept;

public class StringBuilderConcepts {

    public static void main(String[] args) {
        StringBuilder name1 = new StringBuilder("krishna");
        StringBuilder name2 = new StringBuilder("krishna");
        System.out.println(name1.toString().equals(name2.toString()));
        System.out.println(name1==name2);
        StringBuilder name3 = new StringBuilder("Govind");
        StringBuilder name4= new StringBuilder();
         name4= name3;
        System.out.println("Before Appned Name is:"+name4);
      name3.append("Vasudev");
        System.out.println(name3);
        System.out.println(name4);


    }
}
