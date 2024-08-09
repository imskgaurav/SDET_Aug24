package day46.dataProvider.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class DataProviderDemo {
     WebDriver driver;
     String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
      WebDriverWait wait;
      //String emailId = "shashikant.gaurav@gmail.com";
      @BeforeMethod
     public void setUp(){
    System.out.println("Calling SetUp method");
   driver = new ChromeDriver();
   wait = new WebDriverWait(driver,Duration.ofSeconds(10));
   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    driver.get(url);
    System.out.println("Launching Url");

}

@Test(dataProvider = "loginData")
void testLogin(String email, String pwd){
 System.out.println("Login Test Scenarios Testing");
 String title = driver.getTitle();
 System.out.println("Printing the Title"+ title);

    WebElement emailTxt = driver.findElement(By.xpath("//input[@id='input-email']"));
    WebElement passTxt= driver.findElement(By.xpath("//input[@id='input-password']"));
    WebElement loginBtn= driver.findElement(By.xpath("//input[@class='btn btn-primary']"));

    wait.until(ExpectedConditions.visibilityOf(emailTxt));
    wait.until(ExpectedConditions.visibilityOf(passTxt));
    emailTxt.sendKeys(email);
    passTxt.sendKeys(pwd);
    wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
    String str =loginBtn.getDomProperty("value");
    System.out.println(str);
    String str2= loginBtn.getDomAttribute("class");
    System.out.println(str2);
    loginBtn.submit();

    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[normalize-space() ='My Account']"))));

    if(driver.findElement(By.xpath("//h2[normalize-space() ='My Account']")).isDisplayed()){

        Assert.assertTrue(true);
    }
     else{

         Assert.fail();
    }
}

@AfterMethod
void tearDown(){
System.out.println("Tear Down Driver");
WebElement logOutLink = driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']"));
wait.until(ExpectedConditions.visibilityOf(logOutLink));
logOutLink.click();
Assert.assertTrue(driver.getCurrentUrl().contains("logout"), "Logout Url is Wrong");
//driver.close();

}

@DataProvider(name= "loginData")
public Object [][] dataSet(){
         String data[][]= { {"shashikant.gaurav@gmail.com", "2231980"},
                 {"kashyap130420@gmail.com", "13042020"}};
     return data;
}
}
