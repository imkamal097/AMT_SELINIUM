package Utilities;

import org.openqa.selenium.Cookie;

public class Cookies extends Webdriver{
   public static void addCookie(String cname,String cvalue) {
	   Cookie c=new Cookie(cname,cvalue);
	   dr.manage().addCookie(c);
   }
   public static void display() {
	   for(Cookie c: dr.manage().getCookies()){
		   System.out.println("Name: "+c.getName()+" Value: "+c.getValue());
	   }
   }
   public static void delete(String cname) {
	   dr.manage().deleteCookieNamed(cname);
   }
   public static void main(String args[]) {
	   Launch_chr("https://www.flipkart.com");
	   addCookie("UserSession","123456");
	   addCookie("Place","Bangalore");
	   addCookie("Page","Products Page");
	   display();
	   delete("Place");
	   if(dr.manage().getCookieNamed("Place")== null) {
		   System.out.println("Cookie deleted successfully");
	   }
	   else {
		   System.out.println("Not deleted");
	   }
   }
}
