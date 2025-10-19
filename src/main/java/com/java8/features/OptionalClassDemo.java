package com.java8.features;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {

        String s = null ;

        Optional<String> opt = Optional.ofNullable(s);

        System.out.println("Option Object is Returning :"+opt);
        /* It Returns False if :the Value is NULL  */
        System.out.println("Text is Present :"+opt.isPresent());

        String s1 = "Test Java programs";

        Optional<String> opt1 = Optional.ofNullable(s1);

        System.out.println("Get the Real Value of String");

        System.out.println("The String is :"+opt1.get());
        System.out.println("Text is Present :"+opt1.isPresent());
    }
}
