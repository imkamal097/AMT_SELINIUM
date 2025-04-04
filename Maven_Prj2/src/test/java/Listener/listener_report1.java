package Listener;

import Utilities.Webdriver;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Login_Page;
import Pages.Product_Page;
@Listeners(Listener2.class)
public class listener_report1 extends Webdriver{
	Login_Page lp;
	Product_Page pp;
	
	@BeforeMethod
	public void Run() {
		Launch_chr("https://www.saucedemo.com/");
		lp=new Login_Page(dr);
		pp=new Product_Page(dr);
	}
	
   @Test
   public void test1() {
	   lp.enter_name("standard_user");
	   lp.enter_pwd("secret_sauce");
	   lp.click_login();
	   String a=pp.get_title();
	   assertEquals(a,"Products");
   }
   @Test
   public void test2() throws IOException {
	   lp.enter_name("standard_user");
	   lp.enter_pwd("secret_sauce");
	   lp.click_login();
	   String b=pp.get_title();
	   assertEquals(b,"Productssss");
	  
   }
   @AfterMethod
   public void after() {
	   dr.quit();
   }
   
}











//TakesScreenshot ss = ((TakesScreenshot) dr);
//	File srcf = ss.getScreenshotAs(OutputType.FILE);
//	File destfile = new File("C:\\Users\\kamal.s\\Documents\\ss\\1.png");
// FileUtils.copyFile(srcf, destfile);
