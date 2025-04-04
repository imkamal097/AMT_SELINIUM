package stepdef2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import Utilities.Webdriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkout extends Webdriver{
	@When("User agree to terms and conditions button")
	public void user_agree_to_terms_and_conditions_button() {
	    dr.findElement(By.xpath("//div[@class='terms-of-service']/input")).click();
	}
	@When("User Clicks Checkout button")
	public void user_clicks_checkout_button() {
	    dr.findElement(By.xpath("//button[@id='checkout']")).click(); 
	}
	@When("User Clicks the continue in address option")
	public void user_clicks_the_continue_in_address_option() throws InterruptedException { 
		Thread.sleep(4000);
		dr.findElement(By.xpath("//li[@id='opc-billing']//div[@class='buttons']/input[@title='Continue']")).click();  
	}
	@When("User Clicks In store pickup")
	public void user_clicks_in_store_pickup() throws InterruptedException {
		Thread.sleep(3000);
		  dr.findElement(By.xpath("//input[@id='PickUpInStore']")).click();
	}
	@When("User Clicks continue")
	public void user_clicks_continue() throws InterruptedException {
		Thread.sleep(3000);
	    dr.findElement(By.xpath("//div[@class='buttons']/input[@onclick='Shipping.save()']")).click();
	}
	@When("User Clicks COD option")
	public void user_clicks_cod_option() throws InterruptedException {
		Thread.sleep(3000);
	    dr.findElement(By.xpath("//div[@class='buttons']/input[@onclick='PaymentMethod.save()']")).click();
	}
	@When("User Click continue in payment confirmation page")
	public void user_click_continue_in_payment_confirmation_page() throws InterruptedException {
		Thread.sleep(3000);
		dr.findElement(By.xpath("//div[@class='buttons']/input[@onclick='PaymentInfo.save()']")).click();
	}
	@When("user select confirm")
	public void user_select_confirm() throws InterruptedException {
		Thread.sleep(3000);
	    dr.findElement(By.xpath("//div[@class='buttons']/input[@onclick='ConfirmOrder.save()']")).click();
	}
	@Then("check the order placed successfully or not")
	public void check_the_order_placed_successfully_or_not() throws InterruptedException {
		Thread.sleep(10000);
	   String s=dr.findElement(By.xpath("//div[@ class='title']/strong")).getText();
	   assertEquals(s,"Your order has been successfully processed!");
	}

}
