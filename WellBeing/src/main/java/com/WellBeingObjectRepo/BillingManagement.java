package com.WellBeingObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.WellBeing.GenericUtility.WebdriverUtility;

public class BillingManagement

{
	WebdriverUtility Wd=new WebdriverUtility();
	@FindBy(xpath = "//input[@id='PatientUhid']") private WebElement uhid;
	@FindBy(xpath = "//button[@id='searchPatient']") private WebElement searchPatient;
	@FindBy(xpath = "//input[@id='ServiceName']") private WebElement service;
	@FindBy(xpath = "//a[@id='SaveNewBill']/i") private WebElement saveBill;
	@FindBy(xpath = "//table[@id='tableBilling']/tfoot/tr/th[10]") private WebElement totalAmount;
	@FindBy(xpath = "//select[@name='PaymentType-0']") private WebElement paymentType;
	@FindBy(xpath = "//input[@name='InstrumentAmount-0']") private WebElement amount;
	@FindBy(xpath = "//button[@id='saveBilling']") private WebElement saveBillButton;
	
	public BillingManagement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Uhid(String text)
	{
		uhid.sendKeys(text);
		Wd.KeyBoard();
		
	}
	public void SearchBtn()
	{
		searchPatient.click();
	}
	public void enterServiceName(String services)
	{
		service.sendKeys(services);
		Wd.KeyBoard();
	}
	public void saveBillButton()
	{
		saveBill.click();
	}
	public String totalAmount1()
	{
		return totalAmount.getText();
	}
	public void selectPayment(String type)
	{
		Select s=new Select(paymentType);
		s.selectByVisibleText(type);
	}
	public void enterAmount(String amt)
	{
		amount.sendKeys(amt);
	}
	public void clickSaveBill()
	{
		saveBillButton.click();
	}
	
}
