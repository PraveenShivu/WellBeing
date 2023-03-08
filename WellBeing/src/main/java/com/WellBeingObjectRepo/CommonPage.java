package com.WellBeingObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
	@FindBy(xpath = "//aside[@class='left-side sidebar-offcanvas']/div/section/ul/li[2]/a/span") private WebElement IdentityManagement;
	@FindBy(xpath = "//aside[@class='left-side sidebar-offcanvas']/div/section/ul/li[3]/a/span") private WebElement AccountManagement;
	@FindBy(xpath = "//aside[@class='left-side sidebar-offcanvas']/div/section/ul/li[4]/a/span") private WebElement ClaimManagement;
	@FindBy(xpath = "//aside[@class='left-side sidebar-offcanvas']/div/section/ul/li[5]/a/span") private WebElement ResourceScheduling;
	@FindBy(xpath = "//aside[@class='left-side sidebar-offcanvas']/div/section/ul/li[6]/a/span") private WebElement WardManagement;
	@FindBy(xpath = "//aside[@class='left-side sidebar-offcanvas']/div/section/ul/li[7]/a/span") private WebElement InventoryManagement;
	@FindBy(xpath = "//aside[@class='left-side sidebar-offcanvas']/div/section/ul/li[8]/a/span") private WebElement Pharmacy;
	@FindBy(xpath = "//aside[@class='left-side sidebar-offcanvas']/div/section/ul/li[9]/a/span") private WebElement ClinicalDocument;
	@FindBy(xpath = "//aside[@class='left-side sidebar-offcanvas']/div/section/ul/li[10]/a/span") private WebElement Laboratory;
	@FindBy(xpath = "//aside[@class='left-side sidebar-offcanvas']/div/section/ul/li[11]/a/span") private WebElement Report;
	@FindBy(xpath = "//span[.='WelCome-Admin ']") private WebElement AdminDropdown;
	@FindBy(xpath = "//a[.='Sign out']") private WebElement SignOut;


	public CommonPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void identityClick()
	{
		IdentityManagement.click();
	}
	public void accountManagement()
	{
		AccountManagement.click();
	}
	public void claimManagement()
	{
		ClaimManagement.click();
	}
	public void resourceSchedule()
	{
		ResourceScheduling.click();
	}
	public void wardManagement()
	{
		WardManagement.click();
	}
	public void inventoryManagement()
	{
		InventoryManagement.click();
	}
	public void pharmacy()
	{
		Pharmacy.click();
	}
	public void clinicDocument()
	{
		ClinicalDocument.click();
	}
	public void laboratory()
	{
		Laboratory.click();
	}
	public void report()
	{
		Report.click();
	}
	public void logOutApp()
	{
		AdminDropdown.click();		
	}
	public WebElement returnLog()
	{
		return SignOut;
	}
	public void LogOut()
	{
		SignOut.click();
	}
}
