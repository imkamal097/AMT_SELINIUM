package com.selenium.Prj1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSuite2 {
  @Test
  public void test() {
	  WebDriver dr= new ChromeDriver();
	  dr.get("https://demowebshop.tricentis.com");
	  LocalDateTime myDateObj = LocalDateTime.now();
	  DateTimeFormatter myFormatObj =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	  String date=myDateObj.format(myFormatObj);
	  System.out.println("In test - After formatting: "+date);
	  
	  
	  
	  
	  
  }
}
