package basics;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase6SkipTest {

	@Test
	public void TC6SkipMethod1() {
		System.out.println("TC6 @Test TC6SkipMethod1 to make a test skip>> throw new Skip Exception   ");
		throw new SkipException("Skipping the test as the condition is not met");
	}

}


