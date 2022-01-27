package basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BaseTestClass;

public class TestCase1 extends BaseTestClass {

	@BeforeTest
	public void TC1BTcreateDBConn() {
		System.out.println();
		System.out.println("TC1 @BeforeTest  TC1BTcreateDBConn in TestCase1       Creating db conn");
		System.out.println();
	}

	@AfterTest
	public void TC1ATcloseDBConn() {
		System.out.println();
		System.out.println("TC1 @AfterTest  TC1ATcloseDBConn in TestCase1     Closing DB Conn");
		System.out.println();
	}

	@BeforeMethod
	public void TC1BMlaunchBrowser() {

		System.out.println("TC1 @BeforeMethod TC1BMlaunchBrowser in TestCase1            Launching browser");
		
	}

	@AfterMethod
	public void TC1AMcloseBrowser() {

		System.out.println("TC1 @AfterMethod TC1AMcloseBrowser  in TestCase1     Closing the browser");
		System.out.println();
	}
	
	  
	
	@Test(priority=1,groups="TC1functional") 
	//@Test(priority=1)
	public void TC1Method1() {
		 
	  System.out.println("TC1 @Test   TC1Method1(priority=1,groups= TC1functional )  doUserReg in TestCase1             Executing User Reg test");
	  
	  }
	  
	  @Test(priority=2 , groups="TC1functional") 
	 //@Test(priority=2)
	  public void TC1Method2() {
	  
	  System.out.
	  println("TC1 @Test  TC1Method2  (priority=2,groups= TC1functional ) doLogin  in TestCase1              Executing login test");
	  
	  }
	  
	  //  TestCase1 doUserReg   groups="TC1functional") 
	  //  TestCase1 doLogin  groups="TC1functional") 
	  //  TestCase1 dogrouping1  groups= {"functional","smoke"}) 
	  //  TestCase1 dogrouping2  groups= "smoke") 
	
	  
		

		@Test(priority=3,   groups= {"functional","smoke"}) 
		//@Test(priority=1)
		public void TC1Method3grouping1() {
			
		  
		  System.out.println("TC1 @Test  TC1Method3grouping1 (priority=1, groups= {\"functional\",\"smoke\"} )  dogrouping1 in TestCase1             Executing User Reg test");
		  
		  }
	  

		@Test(priority=4,   groups= "smoke") 
		//@Test(priority=1)
		public void TC1Method4grouping2() {
			
		  
		  System.out.println("TC1 @Test  TC2Method4grouping2 (priority=1, groups= smoke )  dogrouping2 in TestCase1             Executing User Reg test");
		  
		  }
	  

}