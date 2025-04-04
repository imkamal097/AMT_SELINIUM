package junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class avg5stud {
	private int n1,n2,n3;
	private int expected;
	
	
  public avg5stud(int n1, int n2, int n3,int expected) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.expected=expected;
		System.out.println("In constructor");
	}

@Parameterized.Parameters
  
  public static List<Object[]> data(){
	Object b[][]=new Object[][] {
		{70,65,79,71},{70,63,52,61},{70,65,79,71},{70,63,52,61},{65,65,65,65}
		};
		List<Object[]> c=Arrays.asList(b);
		return c;
}
  @Test
	public void test() {
		System.out.println("n1:"+n1+"    num2:"+n2+"    n3:"+n3+"       Expected: "+expected);
		System.out.println();
		assertEquals(expected,avgclass.avg(n1,n2,n3));
	}
  
}
  
  
  


