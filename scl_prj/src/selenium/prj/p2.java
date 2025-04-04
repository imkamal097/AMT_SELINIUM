package selenium.prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr1=new ChromeDriver();
        dr1.get("https://www.saucedemo.com/");
        
        dr1.findElement(By.id("user-name")).sendKeys("problem_user");
        dr1.findElement(By.name("password")).sendKeys("secret_sauce");
        dr1.findElement(By.id("login-button")).click();
        
        
        String s= dr1.findElement(By.xpath("//span[@class='title']")).getText();
        System.out.println("Test read = "+s);
        if(s.equals("Products")) {
        	System.out.println("Passed");
        }
        else {
        	System.out.println("Failed");
        }
        dr1.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        
        
        
        
        
        //xpath = //tagname[@attribute='value']
        //xpath=//span[@class='title']
        
        
        
		
//		WebDriver dr2=new EdgeDriver();
//		dr2.get("https://www.flipkart.com");
//		
//		WebDriver dr3=new FirefoxDriver();
//		dr3.get("https://www.flipkart.com");
        
        
	}

}
