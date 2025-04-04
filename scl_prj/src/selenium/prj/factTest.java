package selenium.prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class factTest {
	private String browser;
	WebDriver dr;
	public factTest(String browser) {
		//super();
		this.browser = browser;
	}

  @Test
  public void f() {
	  switch(browser) {
	  case "Chrome":
		  dr=new ChromeDriver();
		 // System.out.println("In chrome");
		  break;
		  
	  case "Firefox":
		  dr=new FirefoxDriver();
		 // System.out.println("In Firefox");
		  break;
		  
	  case "Edge":
		  dr=new EdgeDriver();
		  //System.out.println("In Edge");
		  break;
	  }
	  
  }

  @Factory
  public static Object[] factoryMethod() {
  	Object []brw= {
  			new factTest("Chrome"),
  			new factTest("Firefox"),
  			new factTest("Edge")
  	};
  	return brw;
  }
  @AfterMethod
  public void before() {
  	dr.get("https://www.saucedemo.com/");
  	dr.findElement(By.id("user-name")).sendKeys("problem_user");  //problem_user
    dr.findElement(By.name("password")).sendKeys("secret_sauce");//secret_sauce
    dr.findElement(By.id("login-button")).click();
  	
  }
}
