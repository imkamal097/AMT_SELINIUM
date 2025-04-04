package selenium_pro;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/context-menu");
		dr.manage().window().maximize();
		
		WebElement ele = dr.findElement(By.xpath("//div[@id = 'hot-spot']"));
		
		Actions a = new Actions(dr);
		
		a.contextClick(ele).perform();
		
		Alert al = dr.switchTo().alert(); //alert class for accessing the alert window
		System.out.println(al.getText());
		al.accept();
		
		
		
	}

}
