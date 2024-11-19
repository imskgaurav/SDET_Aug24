package com.selenium.prog;

import org.apache.poi.ss.usermodel.*;
import org.testng.internal.EclipseInterface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData_excel {

    public static void main(String[] args) {
        String path = "/Users/07.gaurav/Documents/TestExcel.xlsx";
        FileInputStream fip= null;
        try {
           fip = new FileInputStream(path);
            Workbook wb = WorkbookFactory.create(fip);
            Sheet sh = wb.getSheetAt(0);
              Row row =sh.getRow(0);
              Cell cell = row.getCell(0);
            System.out.println(cell);
            fip.close();

        } catch (FileNotFoundException e) {

        }

        catch (Exception e){

        }

    }
}
