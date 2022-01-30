package parametrization;

import org.testng.annotations.DataProvider;


public class DataproviderHandling {

	// 2 @DataProvider in this class- tests in TC3MultipleDP
	
	@DataProvider(name="dp1")  //TC2TestnDPinDiffClasses  //TC3MultipleDP
	public static Object[][] getData1(){
		
		Object[][] data = null;
      data = new Object[2][2];
		
		data[0][0] = "Isha";
		data[0][1] = "testing";
		
		data[1][0] = "Kalyani";
		data[1][1] = "testing";
		
		return data;
		
    } //getData@DataProvider
	
	
	//TC3MultipleDP
	@DataProvider(name="dp2")  //TC3MultipleDP
	public static Object[][] getData2(){
		
		Object[][] data = null;
      data = new Object[2][3];
		
		data[0][0] = "Isha";
		data[0][1] = "testing";
		data[0][2] = "Isha@testing";
		
		data[1][0] = "Kalyani";
		data[1][1] = "testing";
		data[1][2] = "Kalyani@testing";
		
		return data;
		
    } //getData@DataProvider
	
	
}
