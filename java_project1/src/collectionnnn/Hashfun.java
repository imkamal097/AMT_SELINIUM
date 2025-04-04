package collectionnnn;
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
public class Hashfun{
      public static void disp(HashMap<Integer,Product> original) {
    	  //promain p=new promain();
    	  HashMap<Integer,Product> bill=new HashMap<>();//temporary hashmap
    	  Scanner sc=new Scanner(System.in);
    	  boolean flag=true;
    	  String c="";
    	  //String con="";
    	  int count=0;
    	  while(flag && count==0) {
    	  
    	  System.out.println("Enter the Product ID");
    	  int a=sc.nextInt();
    	  if(a<=10) {
    	  int b=sc.nextInt();
    	  System.out.println("Are you wanted to continue:Yes/No");
    	  c=sc.next();
    	  
    	  count++;
    	  Product set=original.get(a); //assign the values based on key
    	  int sett=set.quantity; 
    	  Product update=new Product();
    	  
    	
    	  update.proname=set.proname;
    	  update.quantity=sett-b;       
    	  update.productID=set.productID;
    	  update.brand=set.brand;
    	  update.price=set.price;
    	  original.put(a, update);//update in original hashmap
    	  
    	  
    	  Product billing=new Product();
    	  billing.brand=set.brand;
    	  billing.price=set.price;
    	  billing.quantity=b;
    	  billing.productID=set.productID;
    	  billing.proname=set.proname;
    	  bill.put(a, billing);//update in temporary hashmap
    	  
    	  if(update.quantity <= b) {
    		  System.out.println("The product is out of stock!!!");
    	  }
    	  }
    	  else {
    		  System.out.println("Please enter the valid Product ID");
    		  break;
    	  }
    	  
    	 
    	  double finaltot=0;
    	  if(c.equals("Yes")) {
    		    System.out.println("+------------+------------------------+----------+--------+----------+");
	            System.out.println("| Product ID | Product Name           | Quantity | Price  | Total    |");
	            System.out.println("+------------+------------------------+----------+--------+----------+");
    		  for(Entry<Integer,Product> k:bill.entrySet()) {
    			  Product p1=k.getValue();
    			  double val=p1.price*p1.quantity;
    			  finaltot+=val;
    			  System.out.println();
    			  System.out.printf("| %-10d | %-22s | %-8d | %-6s | %-8d |\n",p1.productID, p1.proname, p1.quantity, p1.brand,p1.price*p1.quantity);
    			  System.out.println();
    			  
    		  }
    		    System.out.println("+------------+------------------------+----------+--------+----------+");
    		    System.out.println("+------------+------------------------+----------+--------+----------+");
	            System.out.println("| Product ID | Product Name           | Quantity | Price  | Total    |");
	            System.out.println("+------------+------------------------+----------+--------+----------+");

    		  for(Entry<Integer,Product> o:original.entrySet()) {
    			  Product p2=o.getValue();
    				    			  System.out.printf("| %-10d | %-22s | %-8d | %-6s | %-8d |\n",p2.productID, p2.proname, p2.quantity, p2.brand,p2.price);
    		  }
    		  System.out.println("+------------+------------------------+----------+--------+----------+");
    		  
    	  
    		  System.out.println("Are u want to continue?");
    		  String str=sc.next();
    		  if(str.equals("Yes")) {
    			  flag=true;
    			 count=0;
    		  }
    		  else {
    		  flag=false;
    		  }
    		  //break;
    	  }
    	  
    			System.out.println("Your current bill : "+finaltot);  
    	  
    	  
    	  
    	  
    	  
    	  
    	  //sc.close();
    	     	  }
      }
    	   
    	   
    	   
    	  
    		
    	  }
      

