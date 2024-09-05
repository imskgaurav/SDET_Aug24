package prog.test.practices;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


public class Selenium_MobileEmulation {


    WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    Map<String, String> mobileEmulation= new HashMap<>();

    String url= "https://www.bing.com/";


    @BeforeMethod
    public void setUpBrowser(){

        mobileEmulation.put("deviceName","Nexus 7");

        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

    }

    @Test
    public void launchChromeWithEmulation(){

        driver.get(url);

        System.out.println(driver.getPageSource());

    }
}
