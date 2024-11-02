package com.sdetqa.SeleniumChallenges;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

/*https://www.youtube.com/watch?v=LTttouDVD80&t=333s /*/
public class LazyPageLoadingSolution {
   static String url ="https://www.booksbykilo.in/new-books" ;
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.navigate().to(url);

        JavascriptExecutor jse= (JavascriptExecutor) driver;
        // Use Javascript to Scroll page till End
      int prevCount = 0;
      int currentCount =0;
          while(true) {

                  List<WebElement> listOfBooks = driver.findElements(By.xpath("//*[@id=\"productsDiv\"]//h3"));
                  System.out.println("Total BooksCount is :" + listOfBooks.size());
                  currentCount= listOfBooks.size();
                 System.out.printf("Count is :" +currentCount);
                  if(currentCount==prevCount){
                      System.out.print("We Reach End of The page");
                      break;
                  }
                  prevCount=currentCount;
              System.out.print("The PREVIOUS count is:" +prevCount);
                  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
              Thread.sleep(3000);
          }

        System.out.println("Total book count  is :" +currentCount);

     driver.quit();
    }

}
