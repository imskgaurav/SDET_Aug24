package Session37.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserSLLHandling {


    public static void main(String[] args) {


        ChromeOptions sslhandling = new ChromeOptions();

        sslhandling.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(sslhandling);

        driver.get("https://self-signed.badssl.com/");
        System.out.println("The page title is : " +driver.getTitle());
        driver.quit();

    }
}
