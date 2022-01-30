package parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC1DPParametrization {
	

	@Test(dataProvider="getData")
	public void TC1ParamtrLogin(String username, String password) {
		
		System.out.println(username+"---"+password);
		
	
	}


@DataProvider
public Object[][] getData() {
	
	
	Object[][] data = new Object[3][2];
	
	data[0][0] = "trainer@way2automation.com";
	data[0][1] = "sdfsdf";
	
	data[1][0] = "java@way2automation.com";
	data[1][1] = "sdfsdfsf";
	
	data[2][0] = "corporate@way2automation.com";
	data[2][1] = "sdfsfssddd";
	
	return data;
	
    }


}//classname

/*
 * Notes: Runs As TestNG Test 
 * 
 * 3 times the test is done>> TC1ParamtrLogin() is
 *  executed 3 times with 3 sets of logindeatils from DataProvider
 * 
 */

