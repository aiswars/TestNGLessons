package paralleltests;

import org.testng.annotations.Test;

public class TC3InvocationCount {         //TC3InvocationCount.java Run As TestNG Test
	
//	@Test(invocationCount=5,threadPoolSize=5)
	@Test(invocationCount=5)
	public void executeTest() {
		
		System.out.println("Invocation count to run a test multiple times");
		
	
	}
}
