package com.WellBeingObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.WellBeing.GenericUtility.WebdriverUtility;

public class EncounterCreation {
	public static Select s;
	WebdriverUtility wd=new WebdriverUtility();
	
	@FindBy(xpath = "//a[.='Ambulatory Revisit']") private WebElement Encounter;
	@FindBy(xpath = "//input[@name='PatientUhid']") private WebElement Uhid;
	@FindBy(xpath = "//button[.='Search']") private WebElement Button;
	@FindBy(xpath = "//td[@class='sorting_1']/a") private WebElement COHID; 
	@FindBy(xpath = "//select") private WebElement encounterPage;
	@FindBy(xpath = "//div[@id='PatientTypeDiv']") private WebElement patientType;
	@FindBy(xpath = "//select[@id='SelectedFacilityDepartment']") private WebElement Department;
	@FindBy(xpath = "//select[@id='ProviderEncounter']") private WebElement Provider;
	@FindBy(xpath = "//select[@id='FacilityDepartmentServiceLocationId']") private WebElement Location;
	@FindBy(xpath = "//button[.='Save']") private WebElement Btn;
	@FindBy(xpath = "//label[@id='lblEncounterNumber']") private WebElement Eid;
	public EncounterCreation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ecreation()
	{
		
		Encounter.click();
	}
	public void Uhid(String value)
	{
		wd.waitTillVisible(Uhid);
		Uhid.sendKeys(value);
	}
	public void Search()
	{

		Button.click();
	}
	public void COH()
	{
		wd.waitTillVisible(COHID);
		COHID.click();
	}
	public void patientTypeDpdn(String text1)
	{
		
		wd.waitTillVisible(patientType);
		s=new Select(patientType);
		s.selectByVisibleText(text1);
		
	}
	public void deptDpdn(String text2)
	{
		wd.waitTillVisible(Department);
		s=new Select(Department);
		s.selectByVisibleText(text2);
	}
	public void providerDpdn(String text3)
	{
		wd.waitTillVisible(Provider);
		s=new Select(Provider);
		s.selectByVisibleText(text3);
	}
	public void locDpdn(String text4)
	{
		wd.waitTillVisible(Location);
		s=new Select(Location);
		s.selectByVisibleText(text4);
	}
	public void saveButton()
	{
		Btn.click();
	}
	public String getEid()
	{
		 String txt = Eid.getText();
		 return txt;
	}
	
}

