package parametrization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class SingleDPforMultipleTests { //	2 tests in TC4SingleDPMultipleTests.java
	

	@DataProvider(name="dp1")
	public static Object[][] getData(Method m){ // Method >> import java.lang.reflect.Method;
		
		Object[][] data = null;
		
		if(m.getName().equals("testLogin1")) {   //test method name from TC4SingleDPMultipleTests
		
		data = new Object[2][2];
		
		data[0][0] = "Isha";
		data[0][1] = "testing";
		
		data[1][0] = "Kalyani";
		data[1][1] = "testing";
		
		}
		else if(m.getName().equals("testLogin2"))  //test method name from TC4SingleDPMultipleTests
		{			
			data = new Object[2][3];
			
			data[0][0] = "Isha";
			data[0][1] = "testing";
			data[0][2] = "Isha@testing";
			
			data[1][0] = "Kalyani";
			data[1][1] = "testing";
			data[1][2] = "Kalyani@testing";
			
		}
		return data;
		
		
	}//getData(Method m){
}
	
	
	
/*
 * @DataProvider(name="dp2") //TC3MultipleDP public static Object[][]
 * getData2(){
 * 
 * Object[][] data = null; data = new Object[2][3];
 * 
 * data[0][0] = "Isha"; data[0][1] = "testing"; data[0][2] = "Isha@testing";
 * 
 * data[1][0] = "Kalyani"; data[1][1] = "testing"; data[1][2] =
 * "Kalyani@testing";
 * 
 * return data;
 * 
 * } //getData@DataProvider
 */