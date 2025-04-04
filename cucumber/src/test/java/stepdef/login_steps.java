package stepdef;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import Utilities.Webdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps extends Webdriver{                                     
	
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
		
	    System.out.println("The login page is displayed");
		Launch_chr("https://www.saucedemo.com/");
		
	}
	@When("Enter the username")
	public void enter_the_username() {
	   
		dr.findElement(By.id("user-name")).sendKeys("problem_user");
	}
	@When("Enter the password")
	public void enter_the_password() {
		dr.findElement(By.name("password")).sendKeys("secret_sauce");//secret_sauce
	}
	@When("Click the login button")
	public void click_the_login_button() {
		dr.findElement(By.id("login-button")).click();
	}
	@Then("The Product page is displayed")
	public void the_product_page_is_displayed() {
		 String s= dr.findElement(By.xpath("//span[@class='title']")).getText();
		 assertEquals(s,"Products");
	}

}
