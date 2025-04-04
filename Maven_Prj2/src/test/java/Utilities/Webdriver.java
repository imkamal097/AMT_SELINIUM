package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
  protected static WebDriver dr;
  
  protected static void Launch_chr(String str) {
	  dr=new ChromeDriver();
	  dr.get(str);
	  dr.manage().window().maximize();
  }
  public static void screenshot() throws IOException{
	   TakesScreenshot ss = ((TakesScreenshot) dr);
		File srcf = ss.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\kamal.s\\Documents\\ss\\1.png");
	    FileUtils.copyFile(srcf, destfile);

  }
  
}
