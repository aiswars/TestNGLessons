package LearnListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {

	
		System.out.println("----------Passed Test------- - "+result.getName());
		System.out.println(" The method passed is    "+result.getName());		
		System.out.println();//new line in console
		
	}

	public void onTestFailure(ITestResult result) {

		System.setProperty("org.uncommons.reportng.escape-output","false");
		 //Reporter.log("<a href=\"F:\\screenshot\\error.jpg\" target=\"_blank\">Screenshot link</a>");
		//Reporter.log("<br>");
	//	Reporter.log("<a href=\"F:\\screenshot\\error.jpg\" target=\"_blank\"><img height=200 width=200 src=\"F:\\screenshot\\error.jpg\"></a>");
		System.out.println("-------FAILED TEST---------"); 
		System.out.println("-------------Capturing Screenshot for the Failed test-------------- ");
		System.out.println(" The method failed is    "+result.getName());
		System.out.println(" The method failed is    "+result.getTestClass().getTestName());  //got null??
		System.out.println(); //new line in console
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("-------SKIPPED TEST---------"); 
		System.out.println(" The method skipped is    "+result.getTestClass().getTestName());  //got null??
		System.out.println(" The method skipped is    "+result.getName());
		System.out.println(); //new line in console
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

		
	}

