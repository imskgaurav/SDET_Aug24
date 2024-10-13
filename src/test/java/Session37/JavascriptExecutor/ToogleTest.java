package Session37.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToogleTest {
   static String url = "https://www.w3schools.com/howto/howto_css_switch.asp";
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        By toggleBar = By.cssSelector("#main > label:nth-child(11) > div");
        WebElement elm = driver.findElement(toggleBar);
        elm.click();
    }
}
