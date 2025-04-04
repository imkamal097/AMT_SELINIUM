package selenium.prj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
        dr.get("https://demoqa.com/alerts");
        WebElement ele=dr.findElement(By.xpath("//button[@id='alertButton']"));
        ele.click();
        try {
        	Thread.sleep(1000);
        }
        catch(InterruptedException e) {
        	e.printStackTrace();
       }
        Alert a=dr.switchTo().alert();
        String alertmsg=a.getText();
        System.out.println("Alert message : "+alertmsg);
        a.accept(); //to select OK
        //a.dismiss(); //to select CANCEL
       
	}

}
