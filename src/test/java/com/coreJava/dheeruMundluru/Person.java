package com.coreJava.dheeruMundluru;

import com.java.ashokIT.PRIMENumber;
// UDEMY : Tim Buchalka's Learn
public class Person {
    @Override
    public String toString() {
        return "Person{" +
                "fistName='" + fistName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    private String fistName;
    private String lastname;

    public Person(){
        this("Eric", "Johnson");
    }

    public Person(String fname, String lname) {

         this.fistName= fname;
         this.lastname= lname;
    }

    public static void main(String[] args) {
        //Person p = new Person();
      Person p1 = new Person("TEST", "jOHN");
        System.out.println(p1);


    }

}
