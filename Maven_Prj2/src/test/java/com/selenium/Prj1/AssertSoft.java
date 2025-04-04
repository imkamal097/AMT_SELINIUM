package com.selenium.Prj1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSoft {
	SoftAssert sa;
  @Test
  public void test() {
	  sa=new SoftAssert();
	  sa.assertEquals(true, true);
	  System.out.println("in Test 1");
	  sa.assertAll();
  }
  public void test1() {
	  
	 sa.assertEquals(true, true);
	  System.out.println("in Test 1");
	  sa.assertAll();
  }
  public void test2() {
	  
	  sa.assertEquals(true, true);
	  System.out.println("in Test 1");
	  sa.assertAll();
  }
}
