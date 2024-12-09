package com.selenium.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import javax.management.openmbean.CompositeDataInvocationHandler;
import java.time.Duration;
//How to Identify DropDown is multi selected ? : isMultiple() is method name :

public class DropDownSelection {
    static WebDriver driver;
    static String url = "https://www.tutorialspoint.com/selenium/practice/select-menu.php";
    public static void main(String[] args) {
       driver  = new SafariDriver();
       driver.get(url);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

       WebElement elm = driver.findElement(By.xpath("//select[@id=\"demo-multiple-select\"]"));
       Select select = new Select(elm);
       System.out.println(select.isMultiple());
        System.out.println("get Options:"+select.getOptions());
    
    }


}
