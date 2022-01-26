package basics;

import org.testng.annotations.Test;

public class TestCase4  extends BaseTestClass{
	
	@Test(priority=2, groups= {"functional","smoke"})
	public void dogrouping1() {
		
		System.out.println("@Test(priority=2,  groups= {\"functional\",\"smoke\"}   doLogin in TestCase4               Executing login test");
		
	}

	//@Test(priority=3,dependsOnMethods= "doUserReg",alwaysRun=true,groups= {"functional","smoke"})
	@Test(priority=3)
	public void dogrouping2() {
		
		System.out.println("@Test(priority=3,   no groups  dogrouping2  in TestCase4        Executing Third Test");
	}
	
	//@Test(priority=4,groups="bvt")
	@Test(priority=4, groups= "TC4group")
	public void dogrouping3() {
		
		System.out.println("@Test(priority=4,            dogrouping3 in TestCase4       Executing Fourth Test");
	}
}

//TestCase4  dogrouping1  groups= {"functional","smoke"})
	//TestCase4  dogrouping2 no groups
	//TestCase3  dogrouping3  groups= {TC4group})
	