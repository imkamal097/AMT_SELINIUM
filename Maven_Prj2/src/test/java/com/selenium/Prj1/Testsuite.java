package com.selenium.Prj1;

import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testsuite {
  @Test
  public static void test() {
	  WebDriver dr= new ChromeDriver();
	  dr.get("https://demowebshop.tricentis.com");
	  LocalDateTime myDateObj = LocalDateTime.now();
	  DateTimeFormatter myFormatObj =DateTimeFormatter.ofPattern("ddd-MM-yyyy HH:mm:ss");
	  String date=myDateObj.format(myFormatObj);
	  System.out.println("In test - After formatting: "+date);
	  
	  
	  
	  
	  
  }
}
