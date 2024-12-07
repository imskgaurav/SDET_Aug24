package com.coreJava.InterviewPrep;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA {
    public static void main(String[] args) {
        int x =11;

        Integer i = x;

        String str=String.valueOf(x);

        System.out.println(str.length());

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            
    }


    
}
