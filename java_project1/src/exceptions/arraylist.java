package exceptions;
import java.util.ArrayList;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<student> al=new ArrayList<>();
   student s1=new student("Satish",101);
   student s2=new student("Priya",102);
   student s3=new student("Ram",104);
   
   al.add(s1);
   al.add(s2);
   al.add(s3);
   
   student s4=al.get(0);
   s3.disp();
   for(student s5: al) {
	   if(s5.rollno==102) {
		   System.out.println("\nStudent name is "+s5.name);
	   }
   }
	}
}
