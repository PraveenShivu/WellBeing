package com.WellBeingObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IdentityManagement 
{
	@FindBy(xpath = "//a[.='Patient Registration']") private WebElement patientRegistration;
	@FindBy(xpath = "//a[.='Encounter Creation']") private WebElement encounterCreation;
	@FindBy(xpath = "//a[.='Manage Encounter']") private WebElement manageEncounter;
	@FindBy(xpath = "//a[.='Queue Management']") private WebElement queueManagement;
	
	public IdentityManagement(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void patientRegistrationButton()
	{
		patientRegistration.click();
	}
	public void encounterCreationButton()
	{
		encounterCreation.click();
	}
	public void manageEncounterButton()
	{
		manageEncounter.click();
	}
	public void queueManagementButton()
	{
		queueManagement.click();
	}
}
