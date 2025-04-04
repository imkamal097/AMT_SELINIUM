package selenium_pro;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class assignment_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/slow");
		dr.manage().window().maximize();
		
		Wait<WebDriver> w = new FluentWait<WebDriver> 
				(dr).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		
		//p[@class='alert alert-info']
		WebElement we = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='alert alert-info']")));
		System.out.println(we.getText());
		
//		dr.quit();
	}

}
