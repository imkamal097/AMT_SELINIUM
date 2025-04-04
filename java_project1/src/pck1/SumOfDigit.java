package pck1;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=94382;
		int sum=0;
		int rem=0;
		int m=num;
		while(num > 0) {
			rem=num % 10;
			sum+=rem;
			num /=10;
		}
		System.out.println("Sum of digits of "+m+" = " +sum);
	}
	}

