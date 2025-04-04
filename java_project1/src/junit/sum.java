package junit;

public class sum {
	 static int s=0;
    public static int getSum(int a[]) {
    	for(int i:a) {
    		s+=i;
    	} 
    	return s;
    }
}
