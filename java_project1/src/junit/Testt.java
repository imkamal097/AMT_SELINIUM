package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testt {
    int []a= {10,10,20,30,77};
    
	@Test 
	public void test() {
		assertEquals(sum.getSum(a),147);
	}
	
	
	@Test
	public void test1() {
		assertEquals(sum.getSum(a),149); //false test case
	  //System.out.println(true);
	}

}
