package com.dataDriven.excel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;



import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class SeleniumChallenges{
/////td[text()='Hvidovre']/preceding-sibling::td//input[@type="checkbox"]
    static WebDriver driver = null;
    static String url = "https://selectorshub.com/xpath-practice-page/";
    static String url1= "https://datatables.net/examples/advanced_init/dt_events.html";
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url1);

        //selectCityName("Hvidovre");


      

    }


    public static void selectCityName(String cityName){

     WebElement elm = driver.findElement(By.xpath("//td[text() ='"+cityName+"']"));

     driver.findElement(with(By.xpath("//input[@type= 'checkbox']")).toLeftOf(elm)).click();


    }

}
