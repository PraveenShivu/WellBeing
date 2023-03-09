package com.WellBeingObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PatientRegistration 
{
	public static Select s;
	@FindBy(xpath = "//select[@id='PatientTitle']") private WebElement Title;
	@FindBy(xpath = "//input[@id='PatientFirstName']") private WebElement FirstName;
	@FindBy(xpath = "//input[@id='PatientLastName']") private WebElement LastName;
	@FindBy(xpath = "//select[@id='PatientGender']") private WebElement Gender;
	@FindBy(xpath = "//textarea[@id='PresentAddress1']") private WebElement Address;
	@FindBy(xpath = "//input[@id='MobileNumber']") private WebElement MobNum;
	@FindBy(xpath = "//button[.='Submit']") private WebElement SubmitButton;

	public PatientRegistration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void title(int index)
	{
		s=new Select(Title);
		s.selectByIndex(index);
	}
	public void firstName(String Name)
	{
		FirstName.sendKeys(Name);
	}
	public void lastName(String Lname)
	{
		LastName.sendKeys(Lname);
	}
	public void Gender(String Gn)
	{
		s=new Select(Gender);
		s.selectByVisibleText(Gn);
	}
	public void Adr(String text1)
	{
		Address.sendKeys(text1);
	}
	public void Num(String mobNum)
	{
		MobNum.sendKeys(mobNum);
	}
	public void But()
	{
		SubmitButton.click();
	}
	



}
