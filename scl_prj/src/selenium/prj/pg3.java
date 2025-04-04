package selenium.prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr2=new ChromeDriver();
        dr2.get("https://demowebshop.tricentis.com/");
        
        dr2.findElement(By.className("ico-register")).click();
        dr2.findElement(By.id("gender-male")).click();
        dr2.findElement(By.id("FirstName")).sendKeys("Kamal");
        dr2.findElement(By.id("LastName")).sendKeys("S");
        dr2.findElement(By.name("Email")).sendKeys("kamal2004@gmail.com");
        dr2.findElement(By.name("Password")).sendKeys("KamalS@2004");
        dr2.findElement(By.name("ConfirmPassword")).sendKeys("KamalS@2004");
        dr2.findElement(By.id("register-button")).click();
	}

}
