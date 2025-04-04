package Listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities.Webdriver;

public class Listener2 extends Webdriver implements ITestListener{
	public void onTestFailure(ITestResult result) {
		 try {
			screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Test Failed: "+result.getName());
	}
   public void onTestSuccess(ITestResult result) {
	   Reporter.log("Test Success: "+result.getName());
   }
   public void onTestStart(ITestResult result) {
	   Reporter.log("Test Started: "+result.getName());
   }
}
