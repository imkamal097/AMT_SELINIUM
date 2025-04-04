package JunitTest;

import org.junit.Test;

public class exceptiontest {

 @Test(expected = ArithmeticException.class)
 public void arithtest(){
	 int a=5/0;
 }

 @Test(expected = ArrayIndexOutOfBoundsException.class)
 public void arrayindexTest() {
	 int arr[]=new int[5];
	 arr[7]=10;
 }
 
 
}
