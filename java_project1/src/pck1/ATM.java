package pck1;
import java.util.*;
public class ATM {
	static int bal=10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int pin=0;
       int click=0;
       int curr=0;
       int dep=0;
       boolean flag=true;
       int amount=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("---------Please enter your PIN to proceed further--------");
       pin=sc.nextInt();
       if(pin==2323) {
          while(flag) {
        	  System.out.println("\nPlease enter ");
              System.out.println("1 ----> check balance");
              System.out.println("2 ----> withdraw money");
              System.out.println("3 ----> Deposit money");
              System.out.println("4 ----> Exit\n");
              click=sc.nextInt();
    	   switch(click) {
    	   case 1:
    		     System.out.println("Your balance is "+(bal+curr-amount+dep));
    		     break;
    		     
    	   case 2:
    		     System.out.println("Enter the amount to withdraw");
    		     amount=sc.nextInt();
    		     if(amount <= bal) {
    		    	 System.out.println("Please take the amount");
    		    	 System.out.println("Your current available balance "+(bal-amount+dep));
    		     }
    		     
    		     else
    		    	 System.out.println("You entered amount is higher than your available balance!!!");
    		     break;
    		     
    		     
    	   case 3:
    		    System.out.println("Please enter the amount to deposit");
    		    dep=sc.nextInt();
    		    //bal+=dep;
    		    System.out.println("Your updated balance is "+(bal+dep-amount));
    		    break;
    		    
    	   case 4:
    		    System.out.println("Thank you,visit again :) ");
    		    flag=false;
    		     break;
    		    
    	 default :
    		    System.out.println("Please enter the correct option :( ");
    		    break;
    		     
    	   }
          }
       }
       else
    	   System.out.println("-----------You entered the wrong PIN-------------");
       sc.close();
	}

}
