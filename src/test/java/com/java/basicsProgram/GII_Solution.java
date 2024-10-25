package com.java.basicsProgram;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GII_Solution {
	
	
	public static void main(String[] args) {
		
		
		String url = "";
		
		WebDriver driver = new 	ChromeDriver();
		
		WebDriverWait wait =  new WebDriverWait(driver,Duration.ofMinutes(3));
		driver.get(url);
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(160));
		
		
		
		driver.findElement(By.xpath("")).sendKeys(args);
		
		
		driver.findElement(By.xpath("")).sendKeys(args);
		
		
		WebElement loginBtn = driver.findElement(By.xpath(""));
		
		
		loginBtn.click();
		
		wait.until(ExpectedConditions.invisibilityOf(loginBtn));
		
		///Click on Submenu 
		
		Actions act = new Actions(driver);
		
		WebElement menuLink = driver.findElement(By.xpath(""));
		
		act.moveToElement(menuLink);
		
		
		WebElement subMenuLink = driver.findElement(By.xpath(""));
		
		
		act.moveToElement(subMenuLink);
		
		act.click().build().perform();
		
		// Iterate WebTable// 
		
	}

}
