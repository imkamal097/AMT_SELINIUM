package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_5 {
	public static void main(String args[]) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/selectmenu/");
		dr.manage().window().maximize();
		
		WebElement wel = dr.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		dr.switchTo().frame(wel);
		
		dr.findElement(By.xpath("//span[@id=\"speed-button\"]/span[@class=\"ui-selectmenu-icon ui-icon ui-icon-triangle-1-s\"]")).click();
		dr.findElement(By.xpath("//ul[@id=\"speed-menu\"]/li[2]")).click();
		
		
		
		
	}
}
