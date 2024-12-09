package prog.selenium.InterviewPrep;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabWindows {

   static  String url = "https://search.yahoo.com/";
   static  String url1  ="https://www.bing.com/";

   static String url2 = "https://www.sify.com/";
    public static void main(String[] args) {

     WebDriver driver = new ChromeDriver();

     driver.get(url);

     driver.manage().window().maximize();

     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));


     driver.switchTo().newWindow(WindowType.TAB);

     driver.get(url1);

     driver.switchTo().newWindow(WindowType.TAB);

     driver.get(url2);

      Set<String> newTabs= driver.getWindowHandles();
      for (String s: newTabs){
        String s2=s.toString();
      System.out.println(s2);
      if(s2.contentEquals("4C9969B47C44664B7ACB593294A1C8F2")){
      driver.switchTo().window(s2);
      System.out.println("get current Url:"+ driver.getCurrentUrl());
      driver.switchTo().defaultContent();

      driver.findElement(By.xpath(""));
      By by = new ByXPath(""); 
      }
 
      }

     System.out.println("Yahoooo");
     System.out.println(driver.getTitle());
    }

}
