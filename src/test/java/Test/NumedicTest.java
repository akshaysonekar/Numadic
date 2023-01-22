package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.NumadicPage;
import utility.ExtentReport;
import utility.NumadicElements;
@Listeners(utility.Listeners.class)
public class NumedicTest extends NumadicElements {
	ExtentReports reports;
	ExtentTest test;
	WebDriver driver;
	NumadicPage numedicPage;
	
	@BeforeTest
	public void createReports() {
		reports=ExtentReport.getReport();
	}
	
	@BeforeClass
	public void chrome() {
		driver=Browser.openChromeBrowser();
	
	}
	@Test
	public void verifyHeaderTextTest() throws InterruptedException
	{
		numedicPage=new	NumadicPage(driver);
		test=reports.createTest("verifyHeaderTextTest");
		numedicPage.isHeaderVisible();
		String actualTitle =numedicPage.getHeaderText();
		String expectedTitle="JOIN OUR CREW";
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(2000);
	}
	@Test
	public void dropDown()
	{
		numedicPage=new	NumadicPage(driver);
		test=reports.createTest("dropDown");
		numedicPage.clickOnEngineeringFromDropDown();	
		String expTitle="Numadic Iot Pvt. Ltd. - QA Engineer in";
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test
	public void verifyClickAction()
	{
		numedicPage=new	NumadicPage(driver);
		test=reports.createTest("verifyClickAction");
		numedicPage.clickOniAmIntrested();
		
//		numedicPage.clickOnInitial();
//		numedicPage.EnterFirstName("Akshay");
//		numedicPage.EnterLastName();
//		numedicPage.EnteremailID();
//		numedicPage.EnterMobileNo();
//		numedicPage.EnterStreet();
//		numedicPage.EnterCity();
//		numedicPage.EnterZipCode();
//		numedicPage.EnterCountry();
//		numedicPage.EnterCurrentEmployer();
//		numedicPage.ClickOnCureentJobTitle();
//		numedicPage.EnterSkills();
//		numedicPage.EnterCurrentCTC();
//		numedicPage.EnterexpectedCTC();
//		numedicPage.EnterResonForChange();
//		numedicPage.EnterWhyJoinNumadic();
//		numedicPage.clickOnEducationalDetails();
//		numedicPage.clickOnExperianceDetails();
//		numedicPage.EnterLinkdln();
//		numedicPage.clickOnResume();
	}
	
	

	
	public void captureResults(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if (result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}
		else {
			test.log(Status.SKIP,result.getName());
		}
		
	}
	@AfterTest
	public void flushResutls() {
		reports.flush();
	}


	
}
