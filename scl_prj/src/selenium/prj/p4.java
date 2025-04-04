package selenium.prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr3=new ChromeDriver();
        dr3.get("https://jqueryui.com/");
        dr3.findElement(By.xpath("//*[text()='Checkboxradio']")).click();
        
        WebElement we=dr3.findElement(By.xpath("//iframe[@class='demo-frame']"));
        dr3.switchTo().frame(we);    //separated the 2 frame
       // dr3.findElement(By.xpath(null))
        dr3.findElement(By.xpath("//label[@for='radio-1']")).click();
        dr3.findElement(By.xpath("//label[@for='checkbox-2']")).click();
        dr3.findElement(By.xpath("//label[@for='checkbox-nested-2']")).click();
	}

}
