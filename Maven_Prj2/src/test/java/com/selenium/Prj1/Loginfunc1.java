package com.selenium.Prj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfunc1 { 
	static WebDriver dr1;
	 public static void login() {
		  dr1= new ChromeDriver();
		  dr1.get("https://www.saucedemo.com/");
	      dr1.findElement(By.id("user-name")).sendKeys("problem_user");
	      dr1.findElement(By.name("password")).sendKeys("secret_sauce");
	      dr1.findElement(By.id("login-button")).click();
	      
	  }
}
