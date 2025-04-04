package simpleJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmedForcesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       ArrayList<String> al=new ArrayList<>();
       al.add("mumbai");
       al.add("pune");
       al.add("lakshadweep");
       al.add("goa");
       al.add("pondicherry");
       al.add("bangalore");
       al.add("ladakh");  
       al.add("jammu and kashmir");
       System.out.println("Enter Name: ");
       String name=sc.next();
       System.out.println("Enter your age: ");
       int age=sc.nextInt();
       System.out.println("Enter your location: ");
       String location=sc.next();
       System.out.println("R u specially abled people?:Yes/No");
       String special=sc.next();
       if(special.equals("Yes")) {                                             
    	  
    	   System.out.println("You are not eligible for Armed force");
       }
       else {
       ArmedForces.armed(name,age,location,al);
       }
       
       
     }

}
