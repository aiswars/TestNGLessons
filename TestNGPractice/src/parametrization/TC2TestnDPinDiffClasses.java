package parametrization;


import org.testng.annotations.Test;

public class TC2TestnDPinDiffClasses { // dataProvider="dp1"in DataproviderHandling.java is accessing

	@Test( dataProviderClass = DataproviderHandling.class, dataProvider="dp1") //dataprovider in handlingMultipleDP.java dataProvider="dp1
	public void testLogin(String username,String password){
		
		System.out.println(username+"----"+password);
	} //@Test testLogin
	
	
}
