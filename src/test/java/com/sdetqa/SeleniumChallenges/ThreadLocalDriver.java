package com.sdetqa.SeleniumChallenges;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ThreadLocalDriver {


    public static ThreadLocal<WebDriver> tdriver= new ThreadLocal<>();
    //WebDriver driver;
    public void setDriver( WebDriver driver){
        tdriver.set(driver);
    }
    public WebDriver getDriver(){
        return  tdriver.get();
    }
  String url = "https://www.bing.com/";
 @Test
 public  void testMethod1(){

        getDriver().get(url);

 }

 @AfterTest
     public void closeDriver(){

         tdriver.remove();

     }


 }

