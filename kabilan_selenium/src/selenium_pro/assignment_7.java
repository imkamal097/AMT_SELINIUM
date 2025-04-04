package selenium_pro;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assignment_7 {

	
		static WebDriver dr = new ChromeDriver();
		
		@BeforeMethod
		public static void bef() {
			dr.get("https://jqueryui.com/checkboxradio/");
			dr.manage().window().maximize();
		}
		
		
		@Test
		public void test() {
			String s = dr.getTitle();
			System.out.println(s);
			assertTrue(s.contains("Checkbox"));
		}

}
