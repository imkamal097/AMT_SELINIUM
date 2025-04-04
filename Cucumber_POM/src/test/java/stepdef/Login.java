package stepdef;

import static org.testng.Assert.assertEquals;

import Pages.Login_Page;
import Pages.Product_Page;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{
	Login_Page lp;
	Product_Page pp;
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
	    Launch_chr("https://www.saucedemo.com/");
	    lp = new Login_Page(dr);
	    pp= new Product_Page(dr);
	    
	}
	@When("Enter the username")
	public void enter_the_username() {
	    lp.enter_name("problem_user");
	}
	@When("Enter the password")
	public void enter_the_password() {
	    lp.enter_pwd("secret_sauce");
	}
	@When("Click the login button")
	public void click_the_login_button() {
	    lp.click_login();
	}
	@Then("The Product page is displayed")
	public void the_product_page_is_displayed() {
	   String s=pp.get_title();
	   assertEquals(s,"Products");
	   dr.quit();
	}
}
