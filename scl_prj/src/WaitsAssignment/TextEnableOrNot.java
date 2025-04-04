package WaitsAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Webdriver;

public class TextEnableOrNot extends Webdriver{
public static void main(String args[]) {
	Launch_chr("https://the-internet.herokuapp.com/dynamic_controls");
	dr.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
	WebDriverWait wd=new WebDriverWait(dr, Duration.ofSeconds(10));
	WebElement we=wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
	we.click();
	dr.findElement(By.xpath("//input[@type='text']")).sendKeys("Kamal");
	
}
}
