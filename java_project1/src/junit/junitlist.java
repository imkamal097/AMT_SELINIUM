package junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class junitlist {
    private int num1,num2,expected;

	public junitlist(int num1, int num2, int expected) {
		this.num1 = num1;
		this.num2 = num2;
		this.expected = expected;
		System.out.println("In constructor");
	}
   
	@Parameterized.Parameters
	public static List<Object[]> data(){
		System.out.println("In data method");
		Object b[][]=new Object[][] {
			{1,2,3},{4,5,9},{5,6,11},{-9,-2,-11}   //list is storing the data as 1d array
		};
		List<Object[]> c=Arrays.asList(b); //list c is storing 1D array of object array
		return c;
	}
	
	public int sum(int a,int b) {
		System.out.println("In Sum");
		int c=a+b;
		return c;
	}
	
	@Test
	public void test() {
		System.out.println("num1: "+num1+" num2: "+num2+" Expected: "+expected);
		assertEquals(expected,sum(num1,num2));
	}
}
