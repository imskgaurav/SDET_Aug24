package com.java.basicsProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class TradeSocio {
	
       

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//*WebDriverManager.chromedriver().setup(); *//
		
		ChromeOptions ops= new ChromeOptions();
		
		ops.addArguments("--remote-allow-origins=*");
		
		DesiredCapabilities  dc = new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, ops);
		ops.merge(dc);
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		driver.get("https://gomarketnewuxlive.tradesocio.com/auth/login");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"email\"]")));

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rajeev@tradesocio.com");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Trade@123");

		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='currency']")));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rufous-sandbox\"]")));

		//https://gomarketnewuxlive.tradesocio.com/home/dashboard/open-trades
		
		driver.findElement(By.xpath("//a[normalize-space()=\"Open Trades\"]")).click();
		
       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/table[@matsortactive=\"openDateTime\"]")));
		
		Thread.sleep(10000);
          
		

		List<WebElement> priceVale=driver.findElements(By.xpath("//table[@matsortactive=\"openDateTime\"]//tbody//tr//td[13]"));

		double arr [] = new double [priceVale.size()];

		for(int i =0; i<priceVale.size(); i++) {

		arr[i] = Double.parseDouble(priceVale.get(i).getText());
		}

		System.out.println(Arrays.asList(arr));
		
		
		String totalUPNL=driver.findElement(By.xpath("//h4[@class=\"red ng-star-inserted\"]")).getText();
		System.out.println(totalUPNL);
		
		
		
	}
	
	

}
