package com.design.pattern.parallelExe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo1{
    static WebDriver driver;

    private static ThreadLocal<WebDriver> threadLocalDrv = new ThreadLocal<>();


    String url = "https://tutorialsninja.com/demo/";
    String url2 = "https://www.saucedemo.com/";

    @BeforeMethod
    public void SetUp() {
        System.out.println("Launching nEW chrome");
        threadLocalDrv.set(new ChromeDriver());
        threadLocalDrv.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void testLogin() {
        threadLocalDrv.get().get(url);
        System.out.println("Title is :" + threadLocalDrv.get().getTitle());
    }

    @Test(priority = 2)
    public void test2() {
        driver.manage().deleteAllCookies();
        driver.get(url2);
        System.out.println("Title is :" + threadLocalDrv.get().getTitle());
    }

    @AfterMethod
    public void tearDown() {
        if (threadLocalDrv.get() != null) {

            System.out.println("Test Tear Down");
            //driver.quit();
        }

    }
}