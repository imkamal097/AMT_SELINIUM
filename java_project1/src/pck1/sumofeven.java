package pck1;

public class sumofeven {
	public static void main(String[] args) {
	
		int num=94382;
		int k=num;
		int sum=0,rem=0;
		int res=0;
		while(num > 0) {
			rem=num%10;
			sum=sum+rem;
			num /=10;
			if(rem % 2==0) {
				res+=rem;//add even numbers
			}
		}
		System.out.println("Sum of even digits of "+k+" = " +res);
	}
}
