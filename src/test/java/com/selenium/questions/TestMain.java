package com.selenium.questions;

public class TestMain {
    public static void  main(String[] args) {
        C cc = new C();
        System.out.println(cc);

    }
}
class A {
    A() {
        super();
        System.out.println("AA");
    }
}
    class B extends A {

        B() {
            super();
            System.out.println("BB");
        }
    }

    class C extends B {
        C() {
          super();
            System.out.println("CC");
        }

    }

