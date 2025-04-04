package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
  protected static WebDriver dr;
  
  protected static void Launch_chr(String str) {
	  dr=new ChromeDriver();
	  dr.get(str);
	  dr.manage().window().maximize();
  }
  
}
