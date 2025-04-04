package oOPS;
import java.util.*;
public class aoobank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c=0;
		String b="";
		int ab=0;
        bank_acc a[]=new bank_acc[5];
        for(int i=0;i<5;i++) {
            ab=sc.nextInt();
        	b=sc.next();
        	c=sc.nextInt();
        	a[i]=new bank_acc(ab,b,c);
        	
        	
        }
for(bank_acc i:a) {
	i.disp();
}
        
  
	}

}
