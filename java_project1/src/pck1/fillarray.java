package pck1;

import java.util.Arrays;

public class fillarray {
   public static void main(String args[]) {
	   int n[]= new int[10];
	   Arrays.fill(n,5);
	 for(int i: n) {
		 System.out.println(n[i]+" ");
	 }
   }
}
