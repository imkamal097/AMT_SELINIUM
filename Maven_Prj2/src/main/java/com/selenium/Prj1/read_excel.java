package com.selenium.Prj1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_excel {
          int lastrow,lastcol;
          
          public static void read() throws IOException{
        	  
        	  String filename ="sdata.xlsx";
        	  String sheetname="Sheet1";
        	  FileInputStream fis=new FileInputStream(filename);
        	  XSSFWorkbook wb=new XSSFWorkbook(fis);
        	  XSSFSheet sh=wb.getSheet(sheetname);
        	  XSSFRow r=sh.getRow(0);
        	  XSSFCell cell2=r.getCell(1);
        	  
        	  //String s=cell.getStringCellValue();
        	  //XSSFCell cell2=r.createCell(5);
        	  cell2.setCellValue("Infosys");
          	  FileOutputStream fos = new FileOutputStream(filename);
          	  wb.write(fos);
          	  wb.close();
          //	  System.out.println(s);


          }




}
