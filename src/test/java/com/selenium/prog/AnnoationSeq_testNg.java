package com.selenium.prog;

import org.testng.annotations.*;

public class AnnoationSeq_testNg {

  @BeforeSuite
  public void setUpSuite(){

      System.out.println("before Suite*****");
  }
  @AfterSuite
  public void suiteCompleted(){

      System.out.println("Suite is Completed");
  }
  @BeforeTest

  public void startTestfromXml(){
      String name = "beforetest";

      System.out.println("Start TEST from Suites"+name);
  }

  @AfterTest
  public void completeTest(){
     String test = "Aftertest";
      System.out.println("All Test from Suite Completed"+ test);
  }


  @BeforeClass
  public void beforeClass(){
     String name = "beforeClass";
      System.out.println("class is Running:"+name);
  }

  @AfterClass
  public void afterClass(){
      String name = "afterClass";
      System.out.println("class is Running:"+name);

  }

    @BeforeMethod
    public void openMethod() {
    String methodName= "BeforeMrthod";
        System.out.println("before Method"+methodName);
    }

    @AfterMethod
    public void testmethod(){

        String methodName= "AfterMethod";
        System.out.println("before Method"+methodName);

    }

    @Test
    public void testName() {

      int x = 6+8;
        System.out.println("Test Result is :"+x);

    }
}
