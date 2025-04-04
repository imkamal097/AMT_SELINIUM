package Utilities;

import org.testng.Reporter;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener{
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Failed: "+result.getName());
	}
   public void onTestSuccess(ITestResult result) {
	   Reporter.log("Test Success: "+result.getName());
   }
   public void onTestStart(ITestResult result) {
	   Reporter.log("Test Started: "+result.getName());
   }
}
