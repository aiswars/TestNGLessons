package basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BaseTestClass;

public class TestCase1 extends BaseTestClass {

	@BeforeTest
	public void createDBConn() {

		System.out.println("@BeforeTest createDBConn in TestCase1       Creating db conn");
	}

	@AfterTest
	public void closeDBConn() {

		System.out.println("@AfterTest closeDBConn in TestCase1     Closing DB Conn");
	}

	@BeforeMethod
	public void launchBrowser() {

		System.out.println("@BeforeMethod launchBrowser in TestCase1            Launching browser");
	}

	@AfterMethod
	public void closeBrowser() {

		System.out.println("@AfterMethod closeBrowser  in TestCase1     Closing the browser");
	}
	
	  
	
	@Test(priority=1,groups="TC1functional") 
	//@Test(priority=1)
	public void doUserReg() {
		
	  
	  System.out.println("@Test(priority=1,groups= TC1functional )  doUserReg in TestCase1             Executing User Reg test");
	  
	  }
	  
	  @Test(priority=2 , groups="TC1functional") 
	 //@Test(priority=2)
	  public void doLogin() {
	  
	  System.out.
	  println("@Test(priority=2,groups= TC1functional ) doLogin  in TestCase1              Executing login test");
	  
	  }
	  
	  //  TestCase1 doUserReg   groups="TC1functional") 
	  //  TestCase1 doLogin  groups="TC1functional") 
	  //  TestCase1 dogrouping1  groups= {"functional","smoke"}) 
	  //  TestCase1 dogrouping2  groups= "smoke") 
	
	  
		

		@Test(priority=3,   groups= {"functional","smoke"}) 
		//@Test(priority=1)
		public void dogrouping1() {
			
		  
		  System.out.println("@Test(priority=1, groups= {\"functional\",\"smoke\"} )  dogrouping1 in TestCase1             Executing User Reg test");
		  
		  }
	  

		@Test(priority=4,   groups= "smoke") 
		//@Test(priority=1)
		public void dogrouping2() {
			
		  
		  System.out.println("@Test(priority=1, groups= smoke )  dogrouping2 in TestCase1             Executing User Reg test");
		  
		  }
	  

}