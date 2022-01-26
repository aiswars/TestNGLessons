package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTestClass {
	
	@Test(priority=1, groups= {"functional","smoke"})
	//@Test(priority=1)
	public void doUserReg() {
		
		System.out.println("@Test(priority=1  groups= {\"functional\",\"smoke\"}  doUserReg in TestCase3              Executing User Reg test");
	//	Assert.fail("User not registered successfully");
		
	}
	
	//TestCase3  doUserReg  groups= {"functional","smoke"})
	//TestCase3  doLogin  groups= {"functional","smoke"})
	//TestCase3  thirdTest  groups= {"functional","smoke"})
	//TestCase3  fourthTest  no groups
	
	//@Test(priority=2,dependsOnMethods= "doUserReg",groups= {"functional","smoke"})
	@Test(priority=2, groups= {"functional","smoke"})
	public void doLogin() {
		
		System.out.println("@Test(priority=2,  groups= {\"functional\",\"smoke\"}   doLogin in TestCase3               Executing login test");
		
	}

	//@Test(priority=3,dependsOnMethods= "doUserReg",alwaysRun=true,groups= {"functional","smoke"})
	@Test(priority=3, groups= {"functional","smoke"})
	public void thirdTest() {
		
		System.out.println("@Test(priority=3,   groups= {\"functional\",\"smoke\"}     thirdTest  in TestCase3        Executing Third Test");
	}
	
	//@Test(priority=4,groups="bvt")
	@Test(priority=4)
	public void fourthTest() {
		
		System.out.println("@Test(priority=4,            fourthTest in TestCase3       Executing Fourth Test");
	}
}
