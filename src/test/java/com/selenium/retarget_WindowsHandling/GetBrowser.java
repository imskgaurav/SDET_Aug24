package com.selenium.retarget_WindowsHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.temporal.ChronoField;

public class GetBrowser {

    public static WebDriver getBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {

            ChromeDriver chromeDriver = new ChromeDriver();
            return chromeDriver;
        } else if (browserName.equalsIgnoreCase("edge")) {

            EdgeDriver edgeDriver = new EdgeDriver();
            return edgeDriver;
        } else {
            FirefoxDriver fd = new FirefoxDriver();
            return fd;
        }

    }
}