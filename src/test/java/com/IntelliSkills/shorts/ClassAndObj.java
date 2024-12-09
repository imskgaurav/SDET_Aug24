package com.IntelliSkills.shorts;

import org.checkerframework.checker.units.qual.C;

public class ClassAndObj {

    public static void main(String[] args) {
       //Child c = new Parent();//Not allowed
        Parent p = new Child();
          p.dis();
        System.out.println("From Child class Object");
        Child c = new Child();
        c.dis();
    }
}

class Parent {
    void dis() {
        System.out.print("PARENT CLASS");
    }
}

 class Child extends Parent{

     @Override
     void dis() {
         System.out.print("Child CLASS");
     }
 }

