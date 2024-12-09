package com.testAutomationCentral.in;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class chromeInHeadLessMode {
	
	@Test
	public void launchChrome() {
		
		
		ChromeOptions options = new ChromeOptions();
		
		//options.addArguments("--headless= new");
		options.addArguments("--incongnito");
		options.addArguments("window-size =300, 500");
		
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rediffmail.com/");
		
	
		
		System.out.println("Title is"+	driver.getTitle());
		
		
		
		
	}

}
