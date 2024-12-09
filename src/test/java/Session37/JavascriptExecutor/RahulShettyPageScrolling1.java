package Session37.JavascriptExecutor;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class RahulShettyPageScrolling1 {
    WebDriver driver;
     String url = "https://rahulshettyacademy.com/AutomationPractice/";

    @BeforeMethod
    public  void launchApp(){
    driver = new ChromeDriver();
    driver.navigate().to(url);
    driver.manage().window().maximize();

    }

    @Test
    public  void scrollPage() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)  driver;
        jse.executeScript("window.scrollBy(0,600)");
       /* int x= (int) jse.executeScript("return window.pageYOffSet;");
       System.out.println(x);
        Thread.sleep(300);*/
        //Scroll Top the Table :

        jse.executeScript("document.querySelector('.tableFixHead').scrollTop=2000");


        List<WebElement> tdCounts= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

        System.out.print("Total COUNT is :"+tdCounts.size());

        // Add All value
           int sum=0;
         for (WebElement e: tdCounts){

             int x= Integer.valueOf(e.getText().trim());
              sum+=x;


         }
        System.out.print("Sum is :"+sum);
    }

    @AfterMethod
    public void quitDriver(){
        driver.close();
    }

}
