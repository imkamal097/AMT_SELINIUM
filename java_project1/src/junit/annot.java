package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class annot {
     @BeforeClass
     public static void first() {   //static is important
    	 System.out.println("In before class");
     }
     @AfterClass
     public static void second() {     //static is important
    	 System.out.println("In the after class");
     }
     @Before
     public void third() {
    	 System.out.println("In the before");
     }
     @After
     public void four() {
    	 System.out.println("In the after");
     }
     @Test
     public void test() {
    	 System.out.println("In the test 1");
     }
     @Test
     public void test1() {
    	 System.out.println("In the test 2");
     }
     
}
