package prog.selenium.InterviewPrep;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsBasedPopUps {

    public static void main(String[] args) {
      //String url = "";
     WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
     driver.get("https://secure.indeed.com/account/login");

     WebElement elm = driver.findElement(By.xpath("//*[@id=\"login-google-button\"]"));

     elm.click();

      Set<String> s =driver.getWindowHandles();

      Iterator<String> itr = s.iterator();

       String win1 = itr.next();// Parent 

       String child = itr.next();//chiuld

       driver.switchTo().window(child);
       System.out.println(driver.getTitle());

     
    }

}
