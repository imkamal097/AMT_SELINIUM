package selenium.prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginadvanced {
	
	public static void loginValid1(String name,String password) {
		WebDriver dr1=new ChromeDriver();
        dr1.get("https://www.saucedemo.com/");
        dr1.findElement(By.id("user-name")).sendKeys(name);  //problem_user
        dr1.findElement(By.name("password")).sendKeys(password);//secret_sauce
        dr1.findElement(By.id("login-button")).click();
        String s= dr1.findElement(By.xpath("//span[@class='title']")).getText();
        if(s.equals("Products")) {
        	System.out.println("Test case pass valid login credentials");
        }
        else {
        	System.out.println("Test case fail valid login credentials");
        }
	}
	
	public static void loginInValid1(String name,String password) {
		WebDriver dr1=new ChromeDriver();
        dr1.get("https://www.saucedemo.com/");
        dr1.findElement(By.id("user-name")).sendKeys(name);        //problem_user
        dr1.findElement(By.name("password")).sendKeys(password);  //secret_sauce
        dr1.findElement(By.id("login-button")).click();
        String s1= dr1.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
        if(s1.equals("Epic sadface: Username and password do not match any user in this service")) {
        	System.out.println("Test case pass Invalid login credentials");
        }
        else {
        	System.out.println("Test case fail valid login credentials");
        }
	}
    

}
