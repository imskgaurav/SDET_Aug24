package com.selenium.prog;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WebElmScreenShot {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://saucelabs.com/");
        Thread.sleep(3000);
        WebElement elm = driver.findElement(By.xpath("//*[@type='button' and contains(text(), 'Try it free')]"));

        // close the x button

        driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
        System.out.println(elm instanceof SearchContext);
        //*[@type='button' and contains(text(), 'Try it free')]
        try {
            File file = elm.getScreenshotAs(OutputType.FILE);
            File destFile = new File("screenShot/webElm.png");
            FileUtils.copyFile(file, destFile);
        }
        catch (FileNotFoundException  e){
              e.printStackTrace();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
