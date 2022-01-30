package paralleltests;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC1Browser { //Run testngParallelTest.xml - 2 <test>s- browser values- chrome and firefox
		
	@Parameters({"browser"})
	@Test
	public void doLogin(String b) throws InterruptedException {
		
		Date d = new Date();   // to get the time 2 browsers are run
		System.out.println("Browser name : "+b+"--"+d); //just printing the browser name
		Thread.sleep(2000);  //wait given to pause after first browser to see the difference while using <parallel> and not using it
	}
 //try using <parallel> and not using it
}


