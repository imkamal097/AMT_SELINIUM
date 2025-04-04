package selenium_pro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro3 {
	public static void main(String args[]) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://demoqa.com/alerts");
		
		dr.findElement(By.id("alertButton")).click(); 
		
		Alert a = dr.switchTo().alert(); //alert class for accessing the alert window
		System.out.println(a.getText());
		a.accept();
		
		
	}
}
