package com.selenium.prog;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import  org.openqa.selenium.io.FileHandler;


public class ProgTakeScreenShot {

    public static void main(String[] args) throws IOException {


        WebDriver driver = new ChromeDriver();
         driver.get("https://saucelabs.com/");
       TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
       File file= takesScreenshot.getScreenshotAs(OutputType.FILE);
       File destFile = new File("screenShot/webPage1.jpg");
       //using Apache Library //
        //FileUtils.copyFile(file, destFile);
        //Using Selenium FileHandler class method
        FileHandler.copy(file, destFile);


    }
}
