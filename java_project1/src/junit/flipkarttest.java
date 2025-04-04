package junit;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class flipkarttest {
	HashMap<Integer,Product> am=new HashMap<Integer,Product>();
	HashMap<Integer,Product> hm=new HashMap<Integer,Product>();
	
	HashMap<Integer,Product> fin=new HashMap<Integer,Product>();
	
	{
	am.put(1,new Product(1,"TV",15000,"MI",100));
	fin.put(1,new Product(1,"TV",150000,"MI",10));
	double d=150000.0;
	//int k=0;
	}
	@Test
	public void test() {
		//assertEquals(1,1);
//		hm=Hashfun.disp(am); //calling the disp function in Hashfun class
//		Product k;
		//for(Map.Entry<Integer,Product> i:fin.entrySet()) {
			//k=i.getValue();
		    assertTrue(am.equals(hm));
		//}
	}

}
