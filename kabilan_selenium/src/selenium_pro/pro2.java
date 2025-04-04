package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro2 {
	public static void main(String args[]) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.jqueryui.com/");
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//a[@href='https://jqueryui.com/checkboxradio/']")).click();
		
		WebElement Wele = dr.findElement(By.xpath("//iframe[@class= 'demo-frame']")); 
		dr.switchTo().frame(Wele); // switchTo, points to the webpage or frame from the current page
		
		dr.findElement(By.xpath("//label[@for='radio-1']")).click();
		dr.findElement(By.xpath("//label[@for='checkbox-3']")).click();
		
	}
}
