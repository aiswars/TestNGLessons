package parametrization;

import org.testng.annotations.Test;

public class TC4SingleDPMultipleTests { // 1 dataprovider dp1 in SingleDPforMultipleTests.java, 2 tests
	
	
	//same dataprovider dp1 for both tests testLogin1() and testLogin2()
	@Test( dataProviderClass = SingleDPforMultipleTests.class, dataProvider="dp1") //same dataprovider dp1
	public void testLogin1(String username1,String password1){
		
		System.out.println(username1+"----"+password1);
	} //@Test testLogin1
	
	@Test( dataProviderClass = SingleDPforMultipleTests.class, dataProvider="dp1") //NOT dataProvider="dp2") same dataprovider dp1
	public void testLogin2(String username2,String password2, String email){
		
		System.out.println(username2+"----"+password2 +"---" +email);
	} //@Test testLogin2
	

}
