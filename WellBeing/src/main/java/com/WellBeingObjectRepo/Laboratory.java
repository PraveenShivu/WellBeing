package com.WellBeingObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Laboratory 
{
	@FindBy(xpath = "//a[.='DashBoard']") private WebElement dashBoard;
	
	public Laboratory(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void dashBoardButton()
	{
		dashBoard.click();
	}
}
