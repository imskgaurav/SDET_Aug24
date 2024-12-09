package prog.selenium.InterviewPrep;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    WebDriver driver;
    String url = "https://seleniumpractise.blogspot.com/";
    @BeforeMethod
    public void setUp(){
     
     driver = new ChromeDriver();

     driver.manage().window().maximize();
     
     driver.manage().deleteAllCookies();

    }

    @Test(priority = 1)
    public void testScreenShot() throws IOException{
    
        driver.get(url);

         TakesScreenshot  takesScreenshot= (TakesScreenshot)driver;
         
         File file=takesScreenshot.getScreenshotAs(OutputType.FILE);

         File desFile = new File("Picture/page2.png");

        // FileUtils.copyFile(file, desFile);
        file.renameTo(desFile);


    }

    @Test(priority = 2)
    public void takeWebElmScreenShot(){

        driver.get(url);
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        File f1=table.getScreenshotAs(OutputType.FILE);
        File dest= new File("Picture/Elm1.png");

        try {
            FileUtils.copyFile(f1,dest);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void takeFullPageScreenShot(){

        driver.get(url);

        
       ///  (HasFullPageScreenshot) driver;

    }

    @AfterMethod
    public void quitDriver(){

        driver.close();
    }
    
}
