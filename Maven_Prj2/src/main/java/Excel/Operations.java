package Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Operations {
	static HashMap<Integer,student> hm=new HashMap<>();
	public static void read() throws IOException {
	  String filename ="Student1.xlsx";
	  String sheetname="Sheet2";
	  FileInputStream fis=new FileInputStream(filename);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sh=wb.getSheet(sheetname);
	  for(int i=1;i<=3;i++) {
	  XSSFRow r=sh.getRow(i);
	  XSSFCell cell=r.getCell(0);
	  double s=cell.getNumericCellValue();
	  XSSFCell cell1=r.getCell(1);
	  double str=cell1.getNumericCellValue();
	  XSSFCell cell2=r.getCell(2);
	  double str1=cell2.getNumericCellValue();
	  hm.put((int)s,new student((int)s,(int)str,(int)str1));   //storing marks in hashmap  
	  } 
	}
	public static void write() throws IOException {
		  String filename ="Student1.xlsx";
		  String sheetname="Sheet1";
		  FileInputStream fis1=new FileInputStream(filename);
		  XSSFWorkbook wb=new XSSFWorkbook(fis1);
		  XSSFSheet sh1=wb.getSheet(sheetname);
		  
		  int i=1;
		  for(Entry<Integer, student> m:hm.entrySet()) {
			  student s=m.getValue();
			  XSSFRow r=sh1.getRow(i);
        	  XSSFCell cell123=r.getCell(3);
        	  XSSFCell cell0=r.getCell(0);
        	  int id=(int)cell0.getNumericCellValue();
        	  int avg=(s.maths+s.phy)/2;
        	  if(s.sid == id) {
        		  cell123.setCellValue(avg);
        		  i++;
        	  }
		  }
		  FileOutputStream fos = new FileOutputStream(filename);
		  wb.write(fos);
      	  wb.close();
	}
}
   