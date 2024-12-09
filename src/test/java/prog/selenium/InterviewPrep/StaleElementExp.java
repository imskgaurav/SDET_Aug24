package prog.selenium.InterviewPrep;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StaleElementExp {

//https://www.lambdatest.com/blog/webdrivermanager-in-selenium/
String url = "https://www.rediff.com/";
WebDriver driver;
WebDriverWait wait = null;
@BeforeTest
public void setUp(){
driver = new ChromeDriver();

driver.manage().window().maximize();

}

 @Test
 public void checkStaleElementException(){
    
    driver.get(url);
  

   List<WebElement> links= driver.findElements(By.xpath("//div[@class=\"footer alignC\"]/a"));

   for(int i=0; i<links.size(); i++){


        links.get(i).click();



   }
 }  
    
}
