package com.dataDriven.excel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


//https://youtube.com/watch?v=aVHUP_V-nNI
public class PaginationExample1 {

    WebDriver driver =null;
    String url = "https://www.w3schools.com/html/default.asp";
    @Test
    public void testPagination(){
   

    driver= new ChromeDriver();
    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

    driver.get(url);

    By search = By.xpath("//input[@id='tnb-google-search-input']");

    wait.until(ExpectedConditions.elementToBeClickable(search));

   WebElement searchInp= driver.findElement(search);

   searchInp.clear();

   searchInp.sendKeys("Tables");
    WebElement elm = driver.findElement(By.xpath("//*[@href='html_tables.asp' and text()='HTML Tables']"));

    wait.until(ExpectedConditions.elementToBeClickable(elm));
    elm.click();
    wait.until(ExpectedConditions.urlContains("/html_tables.asp"));

     List<WebElement> rowsCounts= driver.findElements(By.xpath("//table[@class='ws-table-all']//tr"));
     ///List<WebElement> cellValue= driver.findElements(By.xpath("//table[@class='ws-table-all']//tr//td"));
 
        for(int i =1; i<rowsCounts.size(); i++){

            List<WebElement> cols=driver.findElements(By.xpath("//table[@class='ws-table-all']//tr["+i+"]//td"));

                for(int j =1; j<cols.size(); j++){
                 String cellText=driver.findElement(By.xpath("//table[@class='ws-table-all']//tr["+i+"]//td["+j+"]")).getText();
                 //System.out.println(cellText);

                 if(cellText.equals("Roland Mendel")){
                   System.out.println("For the Given Name"+ cellText+ "ROWs and columns");
                    System.out.println("Value of rows"+ i);
                    System.out.println("Value of column"+ j);
                    break;
                 }
              
                }
                
                
        }    



    




    }
    
}
