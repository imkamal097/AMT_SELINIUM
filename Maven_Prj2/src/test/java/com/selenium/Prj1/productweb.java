package com.selenium.Prj1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class productweb extends Loginfunc1{
	static int num=1;
	String xp1="//div[@class='inventory_list']/div[";
	String xp2="]/div[2]//a/div";
	String fullxp;
	
	@DataProvider(name="testdata")
	public Object[] getData() {
		Object[] e_product =new Object[] {"Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket","Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)"};
		return e_product;
	}
	@BeforeClass
	public static void Input() {
		login();
	}
	
  @Test
  (dataProvider ="testdata")
  public void test(String e_pname) {
	  fullxp=xp1+num+xp2;
	  String pname=dr1.findElement(By.xpath(fullxp)).getText();
	  Assert.assertEquals(e_pname, pname);
	  num++;
  }
}
