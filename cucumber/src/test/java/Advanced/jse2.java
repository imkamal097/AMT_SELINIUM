package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Webdriver;

public class jse2 extends Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Launch_chr("https://www.saucedemo.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) dr;
		WebElement we = dr.findElement(By.xpath("//*[@id=\"user-name\"]"));
		jse.executeScript("arguments[0].value='standard_user';",we);

	}

}