package com.java.basicsProgram;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;



public class GoIbibio {
	
	static WebDriver driver;
static int sleepTime = 1000;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions ops= new ChromeOptions();
		
		ops.addArguments("--remote-allow-origins=*");
		
		DesiredCapabilities  dc = new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, ops);
		ops.merge(dc);
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/restaurants");
		driver.findElement(By.id("location")).sendKeys("Nice Road");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[text()='NICE Ring Road, Dodda Basti, Sir M Vishweshwaraiah Layout 4th Block, SMV Layout, Bengaluru, Karnataka, India']"))
				.click();
		Thread.sleep(8000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String last_height = js.executeScript("return document.body.scrollHeight").toString();
		List<WebElement> resulistList = null;
		while (true) {
			// 20
			resulistList = driver.findElements(By.xpath("//div[@class='nA6kb']//ancestor::a"));
			resulistList.stream().forEach(e -> System.out.println(e.getText()));
			scrollPageDown();
			Thread.sleep(1500);

			String new_height = js.executeScript("return document.body.scrollHeight").toString();
//		driver.get("https://www.goibibo.com/");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("945466");

	}

}

	private static void scrollPageDown() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
}
