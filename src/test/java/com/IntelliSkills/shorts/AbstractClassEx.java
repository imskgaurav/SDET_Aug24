package com.IntelliSkills.shorts;

import com.beust.ah.A;

public class AbstractClassEx {
    public static void main(String[] ags) {
        Animal a = new Cat();
        a.eat();
        // The reeference is given of Parent class. hence Pareny method are accessbile//
        // a.sleep(  ); is not a type of Animal class.
        //a.sleep();
    }
}

abstract class Animal{

    abstract  void eat();
}
class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("cats Eats");
    }
    void sleep(){
        System.out.println("Cats Sleep");
    }
}