package com.WellBeingObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountManagement 
{
	@FindBy(xpath = "//a[.='Receipt']") private WebElement receipt;
	@FindBy(xpath = "//a[.='Billing']") private WebElement billing;
	@FindBy(xpath = "//a[.='Cancel Bill']") private WebElement cancelBilling;
	@FindBy(xpath = "//a[.='Assigned Plan']") private WebElement assignedPlan;
	
	
	public AccountManagement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void receiptButton()
	{
		receipt.click();
	}
	public void billingButton()
	{
		billing.click();
	}
	public void cancelBillingButton()
	{
		cancelBilling.click();
	}
	public void assignedPlanButton()
	{
		assignedPlan.click();
	}
}
