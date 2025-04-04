package Advanced;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Webdriver;

public class keyboards extends Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_chr("https://www.saucedemo.com/"); 
		
		WebElement we1 = dr.findElement(By.xpath("//*[@id=\"user-name\"]"));
		Actions act = new Actions(dr);
		act.sendKeys(we1,"hello").keyDown(Keys.CONTROL).sendKeys("acvvv").keyUp(Keys.CONTROL).perform();
										
	}

}