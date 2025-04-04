package WaitsAssignment;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import Utilities.Webdriver;
import selenium.prj.fluentwait;

public class Fluentwait1 extends Webdriver{
 public static void main(String args[]) {
        WebDriver dr=new ChromeDriver();
	    dr.get("https://the-internet.herokuapp.com/dynamic_controls");
		dr.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
		Wait<WebDriver> wt=new FluentWait<WebDriver>(dr)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement we=wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
		we.click();
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("Done");
		
		
		
 }
}
