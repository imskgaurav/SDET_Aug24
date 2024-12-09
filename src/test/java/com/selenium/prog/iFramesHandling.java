package com.selenium.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class iFramesHandling {
    //https://play1.automationcamp.ir/frames.html
    WebDriver driver;
    String originalWin=null;
    String url = "https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/";
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        originalWin = driver.getWindowHandle();
        System.out.println("Original Window Title is :"+driver.getTitle());
    }
    @Test
    public void checkIFrames(){
        List<WebElement> frmElm=  driver.findElements(By.tagName("iframe"));
        System.out.println(frmElm.size());
        WebElement img_btn = driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']"));
        img_btn.click();
       WebElement iframe1= driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]"));
        driver.switchTo().frame(iframe1);
       String framesTitle=driver.getTitle();
        System.out.println(framesTitle);
    }

    @AfterClass
    public void closeBrowser(){
     driver.quit();
    }


}
