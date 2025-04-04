package com.selenium.Prj1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class array1d {
	
	@DataProvider(name="testdata")
	public Object[] getData(){
		Object [] data= new Object[] {"user1","user2","user3"};
		
		return data;
	}

  @Test(dataProvider ="testdata")
  public void f(String uid) {
 System.out.println("User Id: "+uid);
}
}