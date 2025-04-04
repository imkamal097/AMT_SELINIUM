package Listener;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener1.class)
public class listener_report {
@Test
public void Test1() {
	System.out.println("Test 1");
	assertTrue(true);
}
@Test
public void Test2() {
	System.out.println("Test 2");
    assertTrue(false);
}
}
