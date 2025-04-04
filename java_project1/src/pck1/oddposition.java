package pck1;

public class oddposition {
	public static void main(String[] args) {
		int num=94382;
		int sum=0;
		int rem=0;
		int m=num;
		int i=1;
		while(num > 0) {
			rem=num % 10;
			if(i%2!=0) {
				sum+=rem;
			}
			num /=10;
			i++;
		}
		System.out.println("Sum of odd positions of "+m+" = " +sum);
	}
}
