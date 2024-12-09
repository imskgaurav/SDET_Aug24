package com.java.LearnInheritance;

import java.sql.SQLOutput;

public class StaticmethodInheritance  extends testStatic{


    static void display(){
        System.out.println("Child Class method");
    }

    public static void main(String[] args) {


        StaticmethodInheritance.display();
    }

}


class testStatic {

    static void display(){

        System.out.println("Parent class Method");
    }
}
