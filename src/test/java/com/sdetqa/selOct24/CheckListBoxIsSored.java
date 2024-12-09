package com.sdetqa.selOct24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import java.time.Duration;

public class CheckListBoxIsSored {
   /// https://www.youtube.com/watch?v=xo9aQ6Opwu0

   public static void main(String[] args) {
   String url = "https://testautomationpractice.blogspot.com/";
       WebDriver drv = new EdgeDriver();
       drv.get(url);
       drv.manage().window().maximize();
       drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       //WebElement elm = drv.findElement(By.xpath("//select[@id='animals']"));
       WebElement elm = drv.findElement(By.xpath("//select[@id='colors']"));
       Select sel = new Select(elm);
       System.out.println(sel.isMultiple());

       List<WebElement> options =sel.getOptions();

       List<String> ddlVal= new ArrayList<>();
       List<String> tempList= new ArrayList<>();
       for(WebElement e: options){
          ddlVal.add(e.getText());
           tempList.add(e.getText());
       }
       System.out.println("Original"+ddlVal);
       Collections.sort(tempList);
       System.out.println("Sorted List "+ tempList);
       System.out.println(ddlVal.equals(tempList));
   }
}
