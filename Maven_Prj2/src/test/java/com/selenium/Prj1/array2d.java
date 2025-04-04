package com.selenium.Prj1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class array2d {
 
	@DataProvider(name="logindata")
	public Object[][] product(){
		Object [][] data= {
				{"user1","pwd1"},
				{"user2","pwd2"},
				{"user3","pwd3"}
		};
		return data;
	}
	@Test (dataProvider="logindata")
	public void Test(String uid,String pwd) {
		System.out.println("In the DataProvider");
	}
}
