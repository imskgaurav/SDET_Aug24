package com.selenium.prog;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import  java.time.Duration;
public class WindowHandling {
    String googleUrl = "https://www.google.co.in/";
    String selUrl = "https://www.selenium.dev/";
    WebDriver driver;
    String originalWin;

    @BeforeClass
    public void setUp(){
   driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.qed42.com/");

        originalWin = driver.getWindowHandle();
        System.out.println("Original Window Title is :"+driver.getTitle());
    }

@AfterClass
    public void tearDown(){
        driver.quit();
}
@Test
public  void switchToOriginalWindow(){
   driver.switchTo().newWindow(WindowType.TAB);
   driver.navigate().to(googleUrl);
    System.out.println("New Tab Page Title: " + driver.getTitle());

    driver.switchTo().newWindow(WindowType.WINDOW);
    driver.navigate().to(selUrl);
    System.out.println("New Window Page Title: " + driver.getTitle());

     for(String win : driver.getWindowHandles()){
      if(win.contentEquals(originalWin)){
          driver.switchTo().window(originalWin);
          break;
      }

     }

}
}
