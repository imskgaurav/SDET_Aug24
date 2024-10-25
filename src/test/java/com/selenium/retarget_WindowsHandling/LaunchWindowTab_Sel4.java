package com.selenium.retarget_WindowsHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Duration;
import  java.util.Set;
public class LaunchWindowTab_Sel4 {
   static String url = "https://www.bing.com/";
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("single Window is Open :");
        driver.get(url);
        String defWindowId=driver.getWindowHandle();
        System.out.println("Default Window id is :"+defWindowId);

        System.out.println("Opening a New Tab");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String>winsId= driver.getWindowHandles();
        System.out.println("Multiple Windows set:"+winsId);
        //switch to default windows

               for( String id :winsId){
                   if(id.contentEquals(defWindowId)){

                       System.out.println("default Windows is Found");
                       driver.switchTo().window(defWindowId);
                       System.out.println(driver.getTitle());



                   }


        }

    }
}
