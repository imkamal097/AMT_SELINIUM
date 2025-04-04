package stepdef2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import Utilities.Webdriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addtocart extends Webdriver{
	 static int i=1;
	static int j=62;
	@Given("Login page should be displayed")
	public void login_page_should_be_displayed() {
	    Launch_chr("https://demowebshop.tricentis.com/"); 
	}
	

@When("Click the Product_Category")
public void click_the_product_category() throws InterruptedException {
	Thread.sleep(5000);
	dr.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']//a[@href='/computers'] ")).click();
}
	
@When("Click the type of product")
public void click_the_type_of_product() {
	dr.findElement(By.xpath("//ul[@class='sublist']//a[@href='/accessories']")).click();
}
@When("Click the particular product {string}")
public void click_the_particular_product(String string) {
	dr.findElement(By.linkText(string)).click();
}	
@When("Click add to cart button is clicked {string}")
public void click_add_to_cart_button_is_clicked(String string) {
    dr.findElement(By.xpath("//input[@class='qty-input']")).clear();
    dr.findElement(By.xpath("//input[@class='qty-input']")).sendKeys(string);
}

@When("Click the Add to cart button")
public void click_the_add_to_cart_button() {
	
	dr.findElement(By.xpath("//input[@id='add-to-cart-button-"+j+"']")).click();
	j+=3;
}

@When("Click the shopping cart button")
public void click_the_shopping_cart_button() {
	  dr.findElement(By.xpath("//a[@href='/cart']//span[@class='cart-label']")).click();
}	
@Then("The product is added in shopping cart page {string}")
public void the_product_is_added_in_shopping_cart_page(String string) throws InterruptedException {
	   Thread.sleep(10000);
	   assertEquals(string,dr.findElement(By.xpath("//table//tbody//tr["+i+"]//td[3]")).getText());
	   i++;
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Given("Login page should be displayed")
//	public void login_page_should_be_displayed() {
//	    Launch_chr("https://demowebshop.tricentis.com/");
//	}
//	@When("Click the Product_Category")
//	public void click_the_product_category() {
//	   dr.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']//a[@href='/computers'] ")).click();
//	}
//	@When("Click the type of product")
//	public void click_the_type_of_product() {
//	    dr.findElement(By.xpath("//ul[@class='sublist']//a[@href='/accessories']")).click();
//	}
//	@When("Click the particular product")
//	public void click_the_particular_product() {
//	    dr.findElement(By.xpath("//div[@class='product-item']//div[@class='picture']//a[@href='/copy-of-tcp-self-paced-training']")).click();
//	}
//	@When("Click add to cart button is clicked")
//	public void click_add_to_cart_button_is_clicked() {
//	    dr.findElement(By.xpath("//input[@id='add-to-cart-button-62']")).click();
//	}
//	@When("Click the shopping cart button")
//	public void click_the_shopping_cart_button() {
//	    dr.findElement(By.xpath("//a[@href='/cart']//span[@class='cart-label']")).click();
//	}
//	@Then("The product is added in shopping cart page")
//	public void the_product_is_added_in_shopping_cart_page() {
//	   String s= dr.findElement(By.xpath("//table//tbody//tr[1]//td[3]")).getText();
//	   assertEquals(s,"TCP Public MT/AT");
//	}

	
	
}
