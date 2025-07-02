package com.java.patternDurgesh;

import org.testng.annotations.Test;

public class TestStaticVar {

    static  int x= 10;
    int y =12;

    public static void main(String[] args) {

        TestStaticVar t1 = new TestStaticVar();
        TestStaticVar t2 = new TestStaticVar();

        t1.x =x+10;
        t1.x= x+20;
        System.out.print("t1 new Value is:"+t1.x);
        System.out.print("New Value :"+t1.x+t2.y);






    }

}
