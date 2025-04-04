package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

public class locators extends Webdriver{
  
	public static void main(String args[]) {
	Launch_chr("https://www.saucedemo.com/");
	By email=RelativeLocator.with(By.tagName("input")).above(By.id("password"));
	dr.findElement(email).sendKeys("standard_user");
	
	By pass=RelativeLocator.with(By.tagName("input")).below(By.id("user_name"));
	dr.findElement(pass).sendKeys("secret_sauce");
	}
}
