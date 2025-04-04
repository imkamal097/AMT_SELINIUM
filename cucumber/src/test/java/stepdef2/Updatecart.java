package stepdef2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import Utilities.Webdriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Updatecart extends Webdriver{
	static int i=1;
	@When("User select the product {string}")
	public void user_select_the_product(String string) {
	   dr.findElement(By.xpath("//table//tbody//tr["+string+"]//td[3]")).click();
	} 
	@When("User select the product {string} and {string}")
	public void user_select_the_product_and(String string, String string2) {
		String s=dr.findElement(By.xpath("//table//tbody//tr["+string+"]//td[5]/input")).getDomAttribute("value");
		dr.findElement(By.xpath("//table//tbody//tr["+string+"]//td[5]/input")).clear();
		int a=Integer.parseInt(s);
		int b=a-Integer.parseInt(string2);
		dr.findElement(By.xpath("//table//tbody//tr["+string+"]//td[5]/input")).sendKeys(String.valueOf(b));
	}
	//  input[@name='itemquantity5228458']
	@When("User Click the update button")
	public void user_click_the_update_button() {
		dr.findElement(By.xpath("//input[@name='updatecart']")).click();
	}
	@Then("verify the product quantity updated or not {string}")
	public void verify_the_product_quantity_updated_or_not(String string) throws InterruptedException {
		Thread.sleep(5000);
		String s=dr.findElement(By.xpath("//table//tbody//tr["+i+"]//td[5]/input")).getDomAttribute("value");
	   // System.out.println(s);
		assertEquals(string,s);
	    i++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@When("User Click the product to remove")
//	public void user_click_the_product_to_remove() {
//	    dr.findElement(By.xpath("//input[@name='removefromcart']")).click();
//	}
//	@When("User Click the update button")
//	public void user_click_the_update_button() {
//	   dr.findElement(By.xpath("//input[@name='updatecart']")).click();
//	} 
//	@Then("The updated cart is displayed")
//	public void the_updated_cart_is_displayed() { 
//	   
//	}
}
