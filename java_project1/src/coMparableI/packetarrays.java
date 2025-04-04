package coMparableI;

import java.util.Arrays;
public class packetarrays {
public static void display(int []a) {
	for(int i:a) {
		System.out.println(i+ " ");
	}
	System.out.println();
}
public static void main(String args[]) {
	// TODO Auto-generated method stub
	int []arr= {22,91,8,101,6,18};
	display(arr);
	Arrays.sort(arr);
	display(arr);
	int pos=Arrays.binarySearch(arr, 91);
	System.out.println("Position: "+pos);
	int arr1[]=new int[5];
	int arr2[]=new int[5];
	Arrays.fill(arr1, 5);
	Arrays.fill(arr2, 5);
	System.out.println("After filling");
	display(arr1);
	display(arr2);
     
}
}
