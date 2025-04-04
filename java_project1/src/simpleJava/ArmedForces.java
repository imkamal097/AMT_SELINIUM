package simpleJava;

import java.util.ArrayList;

public class ArmedForces {
       public static void armed(String name,int age,String location,ArrayList<String> al) {
    	   if(age >= 17 && age <= 34) {
    		   if(al.contains(location)) {
    			   System.out.println(name+" is not eligible for Armed force");
    		   }
    		   else {
    			   System.out.println(name+" is eligible for Armed force");
    		   }
    	   }
    	   else {
    		   System.out.println(name+" is not eligible for Armed force");
    	   }
       }
}

