package basics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestClass {
	@BeforeSuite
	public void setUp() {
		
		System.out.println("@BeforeSuite Initializing Everything !!!");
	}
	
	@AfterSuite
	public void tearDown() {
		
		System.out.println("@AfterSuite Quitting Everything !!!");
	}
}
