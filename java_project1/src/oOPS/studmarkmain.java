package oOPS;
import java.util.*;
public class studmarkmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int high=0;
		String n="";
		studmark1 s[]=new studmark1[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			String a=sc.next();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			s[i]=new studmark1(a,b,c,d);
		}
	  for(int i=0;i<3;i++) {
		  s[i].high();
	  }
	  for(int i=0;i<3;i++) {
		  if(high < s[i].calculate()) {
			  high=s[i].calculate();
			  n=s[i].name;
		  }
	  }
		System.out.println("With "+high+","+n+" is the highest scorer");
	  sc.close();
	}

	public studmarkmain() {
		//super();
	}

}
