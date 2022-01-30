package paralleltests;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Running parallel tests using @DataProvider >> TC2DPParallelTests.java- Run as TestNg test
public class TC2DPParallelTests {//	2. @DataProvider(parallel=true)

	@Test(dataProvider="getData")
	public void doLogin(String b) throws InterruptedException {
		
		Date d = new Date();
		System.out.println("Browser name : "+b+"--"+d);
		Thread.sleep(2000);
	}
	
	//@DataProvider  
	@DataProvider(parallel=true)
	public Object[][] getData(){
		
		Object[][] data = new Object[2][1];
		
		data[0][0] = "chrome";
		
		data[1][0] = "firefox";
		
		return data;
	}
	

}


