package com.selenium.prog;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

import  org.openqa.selenium.io.FileHandler;

public class FileHandler_SelProg {

    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();

        driver.get("https://news.google.com/");

        driver.manage().window().maximize();
        // By default this Screenhsot is saved in Temp File//
        try {
            File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(f, new File( "screenShot/chrome.png"));

        }
        catch (IOException ie){

            System.out.println(ie.toString());
        }


    }
}
