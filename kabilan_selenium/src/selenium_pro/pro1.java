package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro1 {
	public static void main(String args[]) {
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.saucedemo.com/");
	dr.manage().window().maximize();
	
	dr.findElement(By.id("user-name")).sendKeys("standard_user");
	dr.findElement(By.id("password")).sendKeys("secret_sauce");
	dr.findElement(By.id("login-button")).click();
	
	String s = dr.findElement(By.xpath("//div[@class = 'app_logo']")).getText();
	
	if(dr.findElement(By.xpath("//div[@class = 'app_logo']")).isDisplayed()) {
		System.out.println("Page login success");
	}
	else {
		System.out.println("Page login failed");
	}
	
	}
	
}
