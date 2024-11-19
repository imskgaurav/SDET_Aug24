package com.selenium.prog;

import org.testng.annotations.Test;

public class PriorityConcept_testNG {

  @Test(priority = 1)
  public void runtest1(){
      System.out.println("Priority =1");

  }

    @Test(priority = 2)
    public void runtest2(){

        System.out.println("Priority =2");
    }

    @Test
    public void defaultPriority(){

        System.out.println("Test Default:");


    }
}
