package com.WellBeingObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class labDashboard {
	@FindBy(xpath = "//input[@name='UHID']") private WebElement Uhid;
	@FindBy(xpath = "//span[.='Search']") private WebElement Btn;
	
	public labDashboard(WebDriver driver)
	{
		
	}

}
