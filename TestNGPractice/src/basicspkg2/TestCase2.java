package testcasespkg2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import basics.BaseTestClass;

public class TestCase2 extends BaseTestClass {

	
	@Test(groups = "smoke")
	//@Test
	public void TC2Method1pkg2() {

		System.out.println("testcasespkg2 TC2 @Test  TC2Method1(groups=  smoke   )validateTitles validateTitles TestCase2                Beginning");
		
		//   TestCase2   validateTitles  (groups = "smoke")
		
		 
		/*
		 * String expected_title = "Yahoo.com"; //excel String actual_title =
		 * "Gmail.com"; //selenium
		 * 
		 * if(expected_title.equals(actual_title)) {
		 * 
		 * System.out.println("Test case pass"); }else {
		 * 
		 * System.out.println("Test case fail"); }
		 * 
		 * SoftAssert softAssert = new SoftAssert();
		 * 
		 * System.out.println("Validating title");
		 * 
		 * 
		 * 
		 * softAssert.assertEquals(actual_title, expected_title);
		 * //isElementPresent("xpath") - True, False
		 * //Assert.assertTrue(false,"Element not found");
		 * System.out.println("Validating image"); softAssert.assertEquals(true,
		 * false,"image not present");
		 * 
		 * System.out.println("validate text box presence");
		 * softAssert.assertEquals(true, false,"text box not present");
		 * //Assert.fail("Failing the test as the condition is not met");
		 * System.out.println("Ending");
		 * 
		 * 
		 * softAssert.assertAll();
		 */
	}
}