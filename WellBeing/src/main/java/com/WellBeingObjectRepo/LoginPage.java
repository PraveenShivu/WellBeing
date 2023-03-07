package com.WellBeingObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//select[@id='FacilityId']") private WebElement Facilitydropdown;
	@FindBy(xpath = "//input[@name='LoginId']") private WebElement idTextField;
	@FindBy(xpath =  "//input[@name='Password']") private WebElement passwordTextField;
	@FindBy(xpath = "//button[@id='loginBtn']") private WebElement SigninButton;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void facilityClick()
	{
		Facilitydropdown.click();
	}
	public WebElement dropdown1() 
	{
		return Facilitydropdown;
	}

	public void enterLoginId(String id)
	{
		idTextField.sendKeys(id);
	}
	public void pwd(String password)
	{
		passwordTextField.sendKeys(password);
	}
	public void signButton()
	{
		SigninButton.click();

	}
}
