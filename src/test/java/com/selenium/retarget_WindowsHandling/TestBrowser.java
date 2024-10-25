package com.selenium.retarget_WindowsHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {
    static String url = "https://www.yahoo.com/";
    public static void main(String[] args) {
       WebDriver driver= GetBrowser.getBrowser("chrome");

       driver.get(url);
    }
}
