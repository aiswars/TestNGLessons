package LearnListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

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
		
		//TestNG ReportNG
		System.setProperty("org.uncommons.reportng.escape-output","false");  //to generate html output in htm report of TestNG ReportNG
		 
		//TestNG Reporter
		//Reporter.log("<a href=\"F:\\screenshot\\error.jpg\" target=\"_blank\">Screenshot link</a>");
		
		//Reporter.log("<br>");
		//Reporter.log("<a href=\"F:\\screenshot\\error.jpg\" target=\"_blank\"><img height=200 width=200 src=\"F:\\screenshot\\error.jpg\"></a>");
	
		Reporter.log("Reporter.log: Failed test>> Screenshot link");//to print in emailablereport.html
		Reporter.log("Reporter.log  Screenshot link "); //to print in emailablereport.html
	
		//to add a link to screenshot location C:\\automation\\screenshots\\sample.png
		Reporter.log("  <a href=\"C:\\automation\\screenshots\\sample.png\">   Screenshotlink opening same window </a>"); //screenshot link in emailablereport.html
	
		//link to open in new wiwndow>>   target=\"_blank\" 
		Reporter.log("  <a href=\"C:\\automation\\screenshots\\sample.png\" target=\"_blank\">   Screenshotlink opening in new window </a>"); //opening screenshot in new window
		
		Reporter.log("<br>");//break- to get a newline
		//adding a thumbnail, instead of text.
		Reporter.log("  <a href=\"C:\\automation\\screenshots\\sample.png\" target=\"_blank\">  <img height=200 width=200 src=\"C:\\automation\\screenshots\\sample.png\">    </a>");
	 
		//Reporter.log("  <a href=\"F:\\screenshot\\error.jpg\"               target=\"_blank\"> <img height=200 width=200 src=\"F:\\screenshot\\error.jpg\"> </a>");
		
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

