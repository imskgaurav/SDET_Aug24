package com.IntelliSkills.shorts;

import org.checkerframework.checker.units.qual.C;

public class MethodHidingEx {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        p.print1();

    }
}

    class Parent1 {
        static void print1() {
            System.out.println("Parent Method");
        }

    }

 class Child1 extends Parent1 {

        static void print1() {
            System.out.println("Child Method");
        }
    }

