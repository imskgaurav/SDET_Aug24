package org.Singleton.Naveen;

import java.awt.*;

public class Browser {
    //https://www.youtube.com/watch?v=khnair65cVc
    // Step 1: Create Private Static instance of the class

    private static Browser browser;

    //Step2 :Private constructor to prevent/avoid instantiation of Object//
    private Browser(){

    }
    //Step 3: public static method to provide access to instance/Obj

    public static  Browser getInstance(){
        if(browser==null){
            synchronized(Browser.class){
                if(browser ==null){
                browser= new Browser();

                }

            }

        }
        return browser;

    }


    public void display(){

        System.out.println("Browser Instance info");
    }




}
