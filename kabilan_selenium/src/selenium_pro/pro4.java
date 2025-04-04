package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/windows");
		
		for(int i=0;i<5;i++) {
			dr.findElement(By.linkText("Click Here")).click(); //5 times clicks the link
		}
		
		
		int a = 1;
		for(String h : dr.getWindowHandles()) { //access the window in sequence like Entryset for hashmaps
			dr.switchTo().window(h);
			String title = dr.getTitle();
			System.out.println("window " + a + ": "+ title);
			a++;
		}
		
		dr.switchTo().defaultContent(); //return to the default original page
	}
	
	
}
