package com.WellBeingObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
@FindBy(id = "FacilityId") private WebElement Facilitydropdown;
@FindBy(id = "LoginId") private WebElement idTextField;
@FindBy(id = "Password") private WebElement passwordTextField;
@FindBy(xpath = "//button[@id='loginBtn']") private WebElement SigninButton;


	
	

}
