package Session37.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestJavaScriptExecutor {


    public static void main(String[] args) {

     String url = "https://testautomationpractice.blogspot.com/";
        //WebDriver driver = new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);

         By nameLoc = By.cssSelector("#name");

         WebElement nameTxtBox =driver.findElement(nameLoc);

         //nameTxtBox.sendKeys("Test Selenium");

        //Without using sendKeys //We need to typecast WebDriver in JavaScript exctutor//
        // As there is No is A relationShip in WebDriver and JavaScript executor//
        //https://www.lambdatest.com/blog/selenium-4-webdriver-hierarchy/
       // JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("arguments[0].setAttribute('value', 'john')", nameTxtBox);

      // If we used : ChromeDriver reference : We do not need to typecast the Driver instance *//
        JavascriptExecutor jse1 = driver;
        jse1.executeScript("arguments[0].setAttribute('value', 'Kashyap')", nameTxtBox);

      By radioBtn_male = By.cssSelector("#male");

      WebElement radio1=driver.findElement(radioBtn_male);

      //click on radioButton using JavaScript Executor //
        jse1.executeScript("arguments[0].click()",radio1 );






    }
}
