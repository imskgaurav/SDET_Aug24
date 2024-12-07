package prog.selenium.InterviewPrep;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ToolTipsText {

    @Test
    public void getTextFromToolTip() throws InterruptedException{
    //String baseUrl1 = "https://jqueryui.com/tooltip/"; 

    String baseUrl = "https://www.bing.com/";

    WebDriver driver = new ChromeDriver(); 
    
    driver.get(baseUrl);

    driver.manage().window().maximize();

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    String expectedTooltip = "Search the web";


    Thread.sleep(5000);
  WebElement searchToolTips=driver.findElement(By.xpath("//*[@class='search icon tooltip']"));
      
    String toolMsg = searchToolTips.getAttribute("aria-label");

    System.out.println(toolMsg);

    Assert.assertEquals(toolMsg.trim(), expectedTooltip, "Not Matched");

    
   
    
}
//Practice //
WebDriver drv = new ChromeDriver();
public WebElement getElm(By locator){

  try{
  WebElement elm = drv.findElement(locator);


  return elm ;
  }

  catch(NoSuchElementException nse){
   nse.printStackTrace();
    return null;
  }


}
}