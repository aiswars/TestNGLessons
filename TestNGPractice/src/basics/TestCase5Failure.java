package basics;


import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase5Failure  extends BaseTestClass{
		
		@Test
		public void TC5FailMethod1() {
			System.out.println("TC5 @Test  TC5FailMethod1 - to fail>>Assert.Fail - Capture Screenshot");
			
			Assert.fail("Failing the login test"); // to make the test fail
			//here the program terminates and execute the next testmethod; below line wont get executed after hard assertions failure
			System.out.println("@Test TC5FailMethod1 is failed!! This line wont get executed");
		}

	}

///a testcase to make a test fail


