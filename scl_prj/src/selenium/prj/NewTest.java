package selenium.prj;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeMethod
  public void f() {
	  System.out.println("In before Method");
  } 
  @AfterMethod
  public void first() {
	  System.out.println("In After Method");
  } 
  @Test
  public void test() {
	  System.out.println("In the Test");
  }
  @BeforeClass
  public void before() {
	  System.out.println("In the Before class");
  }
  @AfterClass
  public void after() {
	  System.out.println("In the After class");
  }
}
