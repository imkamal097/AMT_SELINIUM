package selenium.prj;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryEx {
	private String browser;
  public FactoryEx(String browser) {
		super();
		this.browser = browser;
	}
  
  
@Test
  public void test() {
	System.out.println("Running test on browser: "+browser);
  }
 @Factory
public static Object[] factoryMethod() {
	Object []brw= {
			new FactoryEx("Chrome"),
			new FactoryEx("Firefox"),
			new FactoryEx("Edge")
	};
	return brw;
}
}
