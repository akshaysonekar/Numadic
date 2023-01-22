package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.NumadicElements;

public class NumadicPage extends NumadicElements {
	@FindBy(xpath="//h2[text()='JOIN OUR CREW']")public WebElement header;
	@FindBy(xpath="//lyte-icon[@class='dropdown']")public WebElement filterDropDown;
	@FindBy(xpath="//lyte-drop-item[text()='Engineering']")public WebElement engineering;
	@FindBy(xpath="//a[text()='QA Engineer']")public WebElement qaEngineering;
	@FindBy(xpath="(//lyte-yield[text()=\"I'm interested\"])[1]")public WebElement iAmIntrested;
	@FindBy(xpath="(//lyte-icon[@class='dropdown'])[1]")public WebElement initial;
	@FindBy(xpath="(//input[@maxlength='125'])[1]")public WebElement firstName;
	@FindBy(xpath="(//input[@maxlength='125'])[2]")public WebElement LastName;
	@FindBy(xpath="(//input[@maxlength='100'])[1]")public WebElement email;
	@FindBy(xpath="(//input[@maxlength='30'])[1]")public WebElement mobileNo;
	@FindBy(xpath="(//input[@maxlength='250'])[1]")public WebElement street;
	@FindBy(xpath="(//input[@maxlength='30'])[2]")public WebElement city;
	@FindBy(xpath="(//input[@maxlength='30'])[3]")public WebElement state;
	@FindBy(xpath="(//input[@maxlength='30'])[4]")public WebElement zipCode;
	@FindBy(xpath="(//input[@maxlength='30'])[5]")public WebElement country;
	@FindBy(xpath="(//input[@maxlength='100'])[2]")public WebElement currentEmployer;
	@FindBy(xpath="//lyte-drop-item[@id=\"Lyte_Drop_Item_6\"]")public WebElement currentJobTitle;
	@FindBy(xpath="//lyte-input[@lt-prop-maxlength='255']")public WebElement skills;
	@FindBy(xpath="(//input[@maxlength='250'])[2]")public WebElement currentCtc;
	@FindBy(xpath="(//input[@maxlength='250'])[3]")public WebElement expectedCtc;
	@FindBy(xpath="(//input[@maxlength='250'])[4]")public WebElement resonForChange;
	@FindBy(xpath="(//input[@maxlength='250'])[5]")public WebElement whyJoinNumadic;
	@FindBy(xpath="(//a[@class=\"tabular-group-add\"])[1]")public WebElement educationalDetails;
	@FindBy(xpath="(//a[@class=\"tabular-group-add\"])[2]")public WebElement experianceDetails;
	@FindBy(xpath="//*[@id=\"rec-form_111222333445\"]/div/lyte-input/div/input")public WebElement linkdln;
	@FindBy(xpath="(//lyte-file-message[@class=\"lyteFileUpdMsgWrap\"])[1]")public WebElement resume;
	
	public NumadicPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void isHeaderVisible()
	{
		header.isDisplayed();
	
	}
	public String getHeaderText()
	{
		return header.getText();
		
	}
	public void clickOnEngineeringFromDropDown()
	{
		filterDropDown.click();
		engineering.click();
		qaEngineering.click();
	}
	public void clickOniAmIntrested()
	{
		iAmIntrested.click();
	}
	public void clickOnInitial()
	{
		initial.click();
	}
	public void EnterFirstName(String FirstName)
	{
		firstName.sendKeys(FirstName);
	}
	public void EnterLastName()
	{
		LastName.sendKeys("Sonekar");
	}
	public void EnteremailID()
	{
		email.sendKeys("akshaysonekar@gmail.com");
	}
	public void EnterMobileNo()
	{
		mobileNo.sendKeys("9970346555");
	}
	public void EnterStreet()
	{
		street.sendKeys("Kothrude");
	}
	public void EnterCity()
	{
		city.sendKeys("Pune");
	}
	public void EnterState()
	{
		state.sendKeys("Maharashtra");
	}
	public void EnterZipCode()
	{
		zipCode.sendKeys("411038");
	}
	public void EnterCountry()
	{
		country.sendKeys("India");
	}
	public void EnterCurrentEmployer()
	{
		currentEmployer.sendKeys("AtosSyntel");
	}
	public void ClickOnCureentJobTitle()
	{
		currentJobTitle.click();
	}
	public void EnterSkills()
	{
		skills.sendKeys("AutomatiomTesting");
	}
	public void EnterCurrentCTC()
	{
		currentCtc.sendKeys("480000");
	}
	public void EnterexpectedCTC()
	{
		expectedCtc.sendKeys("As per company Standard ");
	}
	public void EnterResonForChange()
	{
		 resonForChange.sendKeys("UpdateSkills and lear somthing new");
	}
	public void EnterWhyJoinNumadic()
	{
		 whyJoinNumadic.sendKeys("JD suit my expected job");
	}
	public void clickOnEducationalDetails()
	{
		educationalDetails.click();
	}
	public void clickOnExperianceDetails()
	{
		experianceDetails.click();
	}
	public void EnterLinkdln()
	{
		 linkdln.sendKeys("akshay");
	}
	public void clickOnResume()
	{
		resume.click();
	}
	
	
	
	
	
}


