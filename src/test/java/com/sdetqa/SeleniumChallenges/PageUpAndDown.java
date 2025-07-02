package com.sdetqa.SeleniumChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageUpAndDown {

    public static void main(String[] args) throws InterruptedException {

        /*WebDriverManager.chromedriver().clearDriverCache().setup();*/
       ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);

    }
}
