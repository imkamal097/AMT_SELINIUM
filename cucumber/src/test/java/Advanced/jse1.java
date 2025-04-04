package Advanced;

import org.openqa.selenium.JavascriptExecutor;

import Utilities.Webdriver;

public class jse1 extends Webdriver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_chr("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,400)");

	}

}
