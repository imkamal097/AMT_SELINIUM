package Advanced;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import Utilities.Webdriver;

public class screenshot extends Webdriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Launch_chr("https://www.saucedemo.com/"); 
		TakesScreenshot ss = ((TakesScreenshot) dr);
		File srcf = ss.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\kamal.s\\Documents\\ss\\1.png");
	    FileUtils.copyFile(srcf, destfile);

	}
 
}