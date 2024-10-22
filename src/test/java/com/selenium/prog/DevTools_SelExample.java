package com.selenium.prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.time.Duration;

public class DevTools_SelExample {
   static String url = "https://testautomationpractice.blogspot.com/";
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);


        DevTools devTools=driver.getDevTools();

        devTools.createSession();



    }
}
