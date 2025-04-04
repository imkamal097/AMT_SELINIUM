package JunitTest;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.avgclass; //accessing the method(avgclass) and the package of junit

public class junit {
	
	Object b[][]=new Object[][] {
		{70,65,79,71},{70,63,52,61},{70,65,79,71}
		};
		
		 static int n1,n2,n3,n4,i=0;
		
		@Before
		public void before() {
			Object[] data=b[i];
			n1=(int)data[0];
			n2=(int)data[1];
			n3=(int)data[2];
			n4=(int)data[3];
			i++;
		}
		
		
		@Test
		public void Test1() {
			System.out.println("In test 1 method");
			assertEquals(n4,avgclass.avg(n1, n2, n3));
		}
		@Test
		public void Test12() {
			System.out.println("In test 12 method");
			assertEquals(n4,avgclass.avg(n1, n2, n3));
		}
		@Test
		public void Test123() {
			System.out.println("In test 123 method");
			assertEquals(n4,avgclass.avg(n1, n2, n3));
		}
		@After
		public void Test1234() {
			System.out.println();
			System.out.println("After test method");
		}
		
		
}
































//@Test
//public void test1() {
//	  
//	  for(int i=4;i<8;i++) {
//			assertEquals(expected,avgclass.avg(n1,n2,n3));
//			System.out.println("n1:"+n1+"    num2:"+n2+"    n3:"+n3+"       Expected: "+expected);
//			System.out.println();
//			break;	
//	  }
//}
//
//@Test
//public void test2() {
//	  
//	  for(int i=8;i<12;i++) {
//			assertEquals(expected,avgclass.avg(n1,n2,n3));
//			System.out.println("n1:"+n1+"    num2:"+n2+"    n3:"+n3+"       Expected: "+expected);
//			System.out.println(); 
//			break;	
//	  }
//}


























