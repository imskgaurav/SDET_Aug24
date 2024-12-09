package com.IntelliSkills.shorts;

public class AccessModifierEx {
    public static void main(String[] args) {
        A1 a= new B1();
        //System.out.println(a.display());
    }

}

class A1 {
    private void display() {
        System.out.println("A1");
    }

}

class B1  extends A1{
        void display(){
          System.out.println("B1");

      }
}