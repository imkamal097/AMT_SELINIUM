package com.selenium.Prj1;

import org.testng.annotations.Test;

public class New_group {
  @Test(groups= {"F2,F1"})
  public void test() {
	  System.out.println("In F1 and F2");
  }
  
  @Test(groups= {"F1"})
  public void test1() {
	  System.out.println("In F1");
  }
  
  
  @Test(groups= {"F2"})
  public void test2() {
	  System.out.println("In F2");
  }
}
