package basics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestClass {
	@BeforeSuite
	public void setUp() {
		System.out.println();
		System.out.println("@BeforeSuite BaseTestClass Initializing Everything !!!");
		System.out.println();
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println();
		System.out.println("@AfterSuite BaseTestClass Quitting Everything !!!");
		System.out.println();
	}
}
