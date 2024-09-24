package Session37.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestJavaScriptExecutor {


    public static void main(String[] args) {

     String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);

         By nameLoc = By.cssSelector("#name");

         WebElement nameTxtBox =driver.findElement(nameLoc);

         nameTxtBox.sendKeys("Test Selenium");



    }
}
