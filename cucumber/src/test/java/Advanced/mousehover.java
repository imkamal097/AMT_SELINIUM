package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Webdriver;

public class mousehover extends Webdriver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_chr("https:/www.myntra.com/");
		
		WebElement menu = dr.findElement(By.xpath("//div[@class='desktop-userIconsContainer']"));
		Actions act = new Actions(dr);
		act.moveToElement(menu).perform();

	}

}
