package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class tEsting {
         Scanner sc=new Scanner(System.in);
	@Test
	public void test() {
		System.out.println("Enter the number to find the sum of even numbers in Test 1");
		int num=sc.nextInt();
		assertEquals(sumofeven.SumOfDigit(num),14);
	}
	
	@Test
	public void test1() {
		System.out.println("Enter the number to find the sum of even numbers in Test 2");
		int num1=sc.nextInt();
		assertEquals(sumofeven.SumOfDigit(num1),15);
	}

}
