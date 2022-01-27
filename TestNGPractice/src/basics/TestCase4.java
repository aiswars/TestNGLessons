package basics;

import org.testng.annotations.Test;

public class TestCase4  extends BaseTestClass{
	
	@Test(priority=2, groups= {"functional","smoke"})
	public void TC4dogrouping1() {
		
		System.out.println("TC4 @Test  TC4dogrouping1(priority=2,  groups= {\"functional\",\"smoke\"}   doLogin in TestCase4               Executing login test");
		
	} 

	//@Test(priority=3,dependsOnMethods= "doUserReg",alwaysRun=true,groups= {"functional","smoke"})
	@Test(priority=3)
	public void TC4dogrouping2() {
		
		System.out.println("TC4 @Test (priority=3,   no groups  dogrouping2  in TestCase4        Executing Third Test");
	}
	
	//@Test(priority=4,groups="bvt")
	@Test(priority=4, groups= "TC4group")
	public void TC4dogrouping3() {
		
		System.out.println("TC4 @Test  TC4dogrouping3(priority=4,            dogrouping3 in TestCase4       Executing Fourth Test");
	}
}

//TestCase4  dogrouping1  groups= {"functional","smoke"})
	//TestCase4  dogrouping2 no groups
	//TestCase3  dogrouping3  groups= {TC4group})
	