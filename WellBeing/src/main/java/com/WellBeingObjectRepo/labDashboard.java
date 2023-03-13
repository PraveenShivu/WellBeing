package com.WellBeingObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class labDashboard {
	@FindBy(xpath = "//input[@name='UHID']") private WebElement Uhid;
	@FindBy(xpath = "//span[.='Search']") private WebElement Btn;
	
	public labDashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void uhid(String text)
	{
		Uhid.sendKeys(text);
	}
	public void searchBtn()
	{
	Btn.click();
	}
	

}
