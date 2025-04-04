package JunitTest;

import org.junit.Test;

public class TestSleep {
    @Test(timeout=1500)
    public void testTime() throws InterruptedException {
    	Thread.sleep(1200);  //sleep time should be smaller than timeout to get pass
    }
}
