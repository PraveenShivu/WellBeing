package com.WellBeingObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
@FindBy(id = "FacilityId") private WebElement Facilitydropdown;
@FindBy(id = "LoginId") private WebElement idTextField;
@FindBy(id = "Password") private WebElement passwordTextField;
@FindBy(xpath = "//button[@id='loginBtn']") private WebElement SigninButton;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void selectDropdown()
{
	Select s=new Select(Facilitydropdown);
	s.selectByIndex(1);
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
