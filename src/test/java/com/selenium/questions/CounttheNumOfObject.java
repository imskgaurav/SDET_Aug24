package com.selenium.questions;

public class CounttheNumOfObject {

  private static int count=0;
  public CounttheNumOfObject(){
    count++;
  }


    public static void main(String[] args) {
      CounttheNumOfObject obj = new CounttheNumOfObject();
      CounttheNumOfObject obj2 = new CounttheNumOfObject();
      System.out.print("Count is :"+count);
    }
}
