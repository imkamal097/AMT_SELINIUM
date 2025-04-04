package com.selenium.Prj1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaMeterized {
  @Test
  @Parameters({"OS"})
  public void test(String OS) {
	  System.out.println("Running Test on OS: "+OS);
  }
}
