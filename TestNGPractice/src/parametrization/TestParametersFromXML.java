package parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersFromXML {  // 3 <test>s in testngxmlparametrization.xml >> parametrization.TestParametersFromXML

	//Run As TestNGSuite- Run testng.xml
	
	@Parameters({"browser"})  //  <test name="TestParametersFromXML Test3"><!-- 1 parameter- -->
	@Test
	public void Methodfor1Parameter(String browser) {//passing 1 parameter
		
		System.out.println( browser+ "  Methodfor1Parameter");

	}
	
	//@Parameters({"browser2","env"}) //2 Parameters values
	@Parameters({"browser","env"}) //2 Parameters values
	@Test
	public void Methodfor2Parameters(String browser2,String env) {  //2 <tests> Test1 & Test2 - different parameter values
		
		System.out.println(browser2+"--"+env + "   Methodfor2Parameters");
		
	}
	
	
}
