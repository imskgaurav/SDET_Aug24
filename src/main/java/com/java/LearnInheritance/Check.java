package com.java.LearnInheritance;

public class Check {

    public static void main(String[] args) {

        C1 c1= new C1();

        System.out.println(c1.x);

        C2 c2 = new C2();
        System.out.println(c2.x);// 40

        C1 c3 = new C2();
        System.out.println("Parent Reference Child Object"+c3.x);//
        System.out.println();
        System.out.println("Console is: " + System.console());
    }
}

class C1 {
    int x = 50;
}


class C2  extends C1 {
    int x = 40;
}

