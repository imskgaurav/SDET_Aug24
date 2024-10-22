package com.IntelliSkills.shorts;

public class InheritanceEx1 {
    public static void main(String[] args) {
        AA obj = new BB();
        obj.display();
        System.out.println("With Parent class Reference:"+obj.x);
        BB obj1 = new BB();
        System.out.println("With Child class Ref:"+obj1.x);
        obj1.display();
    }
}

class AA {

    int x =10;

    void display(){

        System.out.println("Value of x in AA;"+x);

    }
}
class BB extends AA{
    int x =30;
    void display(){
        System.out.println("Value of x in BB:"+x);
    }

}
