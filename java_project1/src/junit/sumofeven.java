package junit;

public class sumofeven {
	//int num=94382;
	//int k=num;
	static int sum=0;
	static int rem=0;
	static int res=0; 
	
	public static int SumOfDigit(int num) {
		while(num > 0) {
			rem=num%10;
			sum=sum+rem;
			num /=10;
			if(rem % 2==0) {
				res+=rem;        //add even numbers
			}
		}
		return res;
	}
}
