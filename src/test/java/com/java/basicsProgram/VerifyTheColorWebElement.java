package com.java.basicsProgram;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class VerifyTheColorWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions ops= new ChromeOptions();
		
		ops.addArguments("--remote-allow-origins=*");
		
		DesiredCapabilities  dc = new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, ops);
		ops.merge(dc);
		WebDriver driver = new ChromeDriver(ops);
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(9));
		
		driver.get("https://www.yatra.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(9));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='wrapper']//*[@id=\"webklipper-publisher-widget-container-notification-container\"]"))));
		
		driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")).click();
		
		WebElement  chkrefund= driver.findElement(By.xpath("//*[@id=\"BE_flight_flsearch_btn\"]"));
		//a[@title='One Way']
		//*[@id="webklipper-publisher-widget-container-notification-container"]
		
		//div[@class='wrapper']//*[@id="webklipper-publisher-widget-container-notification-container"]
		
		//a[@id='webklipper-publisher-widget-container-notification-close-div']
		
		
		
		

	}
	
	
	
	public static String getFontColor(String strTitle, String strkey) {
		
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		if(strTitle.equals("RGB_Verify")) {
			
			hm.put("Red", "rgb(243, 79,79)");
			
		}
		else if (strTitle.equals("HexaDecimalCode_Verify")) {
			
			hm.put("Red", "#F34F4F");
			
			
			
		}
		
		
		
		return "";
	}
	
	
	
	
	
	
	
	
	

}
