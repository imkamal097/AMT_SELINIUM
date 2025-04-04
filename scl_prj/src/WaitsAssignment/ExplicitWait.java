package WaitsAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Webdriver;

public class ExplicitWait extends Webdriver{
  
	public static void main(String args[]) {
		
		Launch_chr("https://the-internet.herokuapp.com/dynamic_controls");
		dr.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		WebDriverWait wd=new WebDriverWait(dr, Duration.ofSeconds(5));
		WebElement we=wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='swapCheckbox()']")));
		we.click(); 
		WebDriverWait wd1=new WebDriverWait(dr, Duration.ofSeconds(5));
		WebElement we1=wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
		we1.click();
		dr.quit();

		
		
	}
}
