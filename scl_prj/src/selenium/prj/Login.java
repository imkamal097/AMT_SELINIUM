package selenium.prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr3=new ChromeDriver();
        dr3.get("https://demowebshop.tricentis.com/");
        dr3.findElement(By.className("ico-login")).click();
        dr3.findElement(By.id("Email")).sendKeys("kamal2004@gmail.com");
        dr3.findElement(By.id("Password")).sendKeys("KamalS@2004");
        dr3.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        String s=dr3.findElement(By.className("account")).getText();
        if(s.equals("kamal2004@gmail.com")) {
        	System.out.println("correct");
        }
        else{
              System.out.println("wrong");
        }
        
        // Testing the buy process
        dr3.findElement(By.xpath("//div[@class='block block-category-navigation']/div//a[@href='/books']")).click();
        
        WebElement we=dr3.findElement(By.name("products-orderby"));
        Select sel =new Select(we);
        // sel.selectByContainsVisibleText("Name: A");
       sel.selectByIndex(1);
       
       dr3.findElement(By.className("button-2 product-box-add-to-cart-button")).click();
         //input[@class='button-2 product-box-add-to-cart-button']
	}

}
