package com.IntelliSkills.shorts;

public class InterfaceEx implements A, B{
    public void method1(String...a) {
        System.out.println("5678");

    }
    @Override
    public void method1() {
        System.out.println("1234");
    }

    public static void main(String[] args) {
        new InterfaceEx().method1();
    }
}
