package Session37.JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollPage {
    WebDriver driver;
    String url = "https://naveenautomationlabs.com/opencart/index.php";
    @BeforeTest
    public void launchChrome(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }

@Test
    public void scrollPage(){

        System.out.println("Scroll page");

    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,300)", "");

    System.out.println("return window.pageYOffset;");


        
}


}
