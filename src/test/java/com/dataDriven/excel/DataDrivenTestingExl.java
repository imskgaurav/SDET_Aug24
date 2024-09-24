package com.dataDriven.excel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataDrivenTestingExl {
  XSSFWorkbook workbook = null;
  XSSFSheet excelSheet= null;
  XSSFRow row = null;
  XSSFCell cell = null;
  //File Handing using Java ?///
    //Excel File Structure :
  //Now Excel -> WorkBook -> Sheet > Row/Column : cell :

   String path = "/Users/07.gaurav/Documents/TestExcel.xlsx";
    File exlfile = new File(path);
    FileInputStream ip;

@Test
public void initExcel(){

    try {
        ip = new FileInputStream(exlfile);
        workbook= new XSSFWorkbook(ip);
        excelSheet = workbook.getSheetAt(0);
        System.out.println(excelSheet);
        int totalRow=excelSheet.getLastRowNum()+1;
        System.out.println(totalRow);

        //total colum wrt ROW//
        for(int c=0; c<totalRow; c++) {
           int colNum= excelSheet.getRow(c).getLastCellNum();
            System.out.println("For the row Num:" +c+" TOTAL COL IS: "+colNum);


        }


    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }


}
}



