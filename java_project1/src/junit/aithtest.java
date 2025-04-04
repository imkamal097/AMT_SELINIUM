package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class aithtest {

	@Test
	public void testSum1() {
		assertEquals(10,add.sum(5,5));
	}
	
	@Test
	public void testSum2()
	{
		assertEquals(12,add.sum(7, 5));
	}
	
	@Test
	public void testSub() {
		assertEquals(15,subt.subtract(30, 15));
	}
	
	@Test
	public void testSub1() {
		assertEquals(12,subt.subtract(30, 18));
	}
}
