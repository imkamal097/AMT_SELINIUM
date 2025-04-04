package pck1;

import java.util.Arrays;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n[]= {1,2,5,6,3,4,8,7};
           int x=Arrays.binarySearch(n, 5);
           System.out.println("The index of 5 is "+x);
	}
}