package pck1;
import java.util.*;
public class factorialarray {
	public static void main(String[] args) {
		int f[][]=new int[5][2];
		Scanner sc=new Scanner(System.in);	
		for(int i=0;i<5;i++) {
		   System.out.println("Enter the number: ");
		   int num = sc.nextInt();
		   int fact=1;
			for(int j=1;j<=num;j++) {
				  fact*=j;
					f[i][0]=num;
					f[i][1]=fact;		
		}	
		}
		for(int i=0;i<5;i++)
		System.out.println("The Factorial of " +f[i][0]+ " ---> "+f[i][1]);
		sc.close();
	}
}
