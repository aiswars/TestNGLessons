package parametrization;

import org.testng.annotations.Test;

public class TC3MultipleDP {// 2 dataproviders dp1 and dp2 in DataproviderHandling.java and 2 tests in TC3MultipleDP.java
	
	@Test( dataProviderClass = DataproviderHandling.class, dataProvider="dp1") //dataProvider="dp1" dataprovider name from class DataproviderHandling
	public void testLogin1(String username1,String password1){
		
		System.out.println(username1+"----"+password1);
	} //@Test testLogin1
	
	@Test( dataProviderClass = DataproviderHandling.class, dataProvider="dp2")//dataProvider="dp2" in DataproviderHandling
	public void testLogin2(String username2,String password2, String email){
		
		System.out.println(username2+"----"+password2 +"---" +email);
	} //@Test testLogin2
	
}
