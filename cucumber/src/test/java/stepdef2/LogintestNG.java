package stepdef2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import Utilities.Webdriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogintestNG extends Webdriver{
	
	@When("Click login button")
	public void click_login_button() {
		dr.findElement(By.className("ico-login")).click();
	}
	@When("Enter the emailID {string}")
	public void enter_the_email_id(String string) {
		dr.findElement(By.id("Email")).sendKeys(string);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String string) {
		 dr.findElement(By.id("Password")).sendKeys(string);
	}
	@When("Click the Submit button")
	public void click_the_submit_button() {
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	
	@Then("The Account page is displayed <{string}>")
	public void the_account_page_is_displayed(String string) {
		//String s=dr.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@href='/customer/info']")).getText();
        if(string.equals("kamal2004@gmail.com")) {
        	assertEquals(string,dr.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@href='/customer/info']")).getText());
        }
        else if(string.equals("Login was unsuccessful. Please correct the errors and try again."))
        {
        	assertEquals(string, dr.findElement(By.xpath("//div[@class='validation-summary-errors']/span")).getText());
        System.out.println("Login Unsuccessful...!");
        }
	
	}
}
