package com.seleniumProg.Dec2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectBasic {
	public static WebDriver driver = null;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		 WebElement selectElement = driver.findElement(By.name("location"));
	     Select select = new Select(selectElement);	
	     
          select.selectByValue("Sydney");
	     
		
		
	}
	}
	

