package pck1;
import java.util.*;
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=20,b=15,d=0;
         System.out.println("Enter the the operation you wanted to do : ");
         Scanner sc=new Scanner(System.in);
         char c=sc.next().charAt(0);
         
         switch(c) 
         {
         case '+':
        	 d=a+b;
        	 System.out.println("Addition");
        	 break;
        	 
         case '-':
        	 d=a-b;
        	 System.out.println("Subtraction");
        	 break;
        	 
         case '*':
        	 d=a*b;
        	 System.out.println("Multiplication");
        	 break;
        	 
         case '%':
        	 d=a%b;
        	 System.out.println("Modulus");
        	 break;
        	 
         case '/':
        	 d=a/b;
        	 System.out.println("Division");
        	 break;
        	 
        	 default:
        		 System.out.println("Enter valid operation");
         }
         System.out.println(a+" "+c+" "+b+" = "+d);
         sc.close();
	}

}
