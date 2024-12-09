package org.java.efficientSol.Inheritance;

public class BB extends AA {


    public void method1(){

        System.out.println("BB class Method");
    }


    public static void main(String[] args) {
    //Calling by Parent Reference and Parent Object//
    AA a1 = new AA();
    a1.method1();
 // Calling by Parent Reference and Child Object//
    AA a2 = new BB();
    a2.method1();

    //Calling by Child Reference

        BB b1 = new BB();
        b1.method1();

    }
}
//pARENT class
class AA{

    public void method1(){

        System.out.println("AA class Method");
    }

}
