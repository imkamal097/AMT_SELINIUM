package exceptions;
public class student {
	String name;
	int rollno;
   student(String n,int r){  //constructor 
	   name=n;
	   rollno=r;
   }
   public void disp() {
	   System.out.println("Student name is: "+name); 
	   System.out.println();
	   System.out.println("Student ID is: "+rollno);
   }
}
