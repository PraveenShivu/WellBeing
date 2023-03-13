package com.WellBeing.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.WellBeingObjectRepo.AccountManagement;
import com.WellBeingObjectRepo.BillingManagement;
import com.WellBeingObjectRepo.CommonPage;
import com.WellBeingObjectRepo.EncounterCreation;
import com.WellBeingObjectRepo.IdentityManagement;
import com.WellBeingObjectRepo.Laboratory;
import com.WellBeingObjectRepo.LoginPage;
import com.WellBeingObjectRepo.PatientRegistration;

public class BaseClass
{
	protected  WebDriver driver;
	public  WebDriver sdriver;
	protected ReadDataFromProperty Property;
	protected LoginPage Log;
	protected CommonPage Com;
	protected JavaUtility java;
	protected WebdriverUtility wd;
	protected ReadDataFromExcel exl;
	protected IdentityManagement idntmgt;
	protected PatientRegistration patient;
	protected EncounterCreation ecCreate;
	protected int randomNumber;
	protected Laboratory lab;
	protected AccountManagement acc;
	protected BillingManagement bill;
	@BeforeClass
	public void Launch()
	{

		Property=new ReadDataFromProperty();
		java=new JavaUtility();
		wd=new WebdriverUtility();
		exl=new ReadDataFromExcel();



		String Browser = Property.getPropertyData(PropertyFileKeys.BROWSER.getKey());
		String Url = Property.getPropertyData(PropertyFileKeys.URL.getKey());
		String Time = Property.getPropertyData(PropertyFileKeys.TIMEOUT.getKey());
		Long timeWait = (Long)java.stringToAnyDataType(Time, "long");
		String numberLimit = Property.getPropertyData(PropertyFileKeys.LIMIT.getKey());
		randomNumber = java.getRandomNumber((Integer) java.stringToAnyDataType(numberLimit, "int"));



		sdriver=driver;
		driver=wd.LaunchApp(Browser, Url,timeWait);
		Log=new LoginPage(driver);
		Com=new CommonPage(driver);
		idntmgt=new IdentityManagement(driver);
		patient=new PatientRegistration(driver);
		ecCreate= new EncounterCreation(driver);
		lab = new Laboratory(driver);
		acc = new AccountManagement(driver);
		BillingManagement bill = new BillingManagement(driver);
	}

	@BeforeMethod
	public void Login()
	{	
		String option = Property.getPropertyData(PropertyFileKeys.OPTION.getKey());
		String Id = Property.getPropertyData(PropertyFileKeys.LOGINID.getKey());
		String Password = Property.getPropertyData(PropertyFileKeys.PASSWORD.getKey());

		Log.facilityClick();
		Log.enterLoginId(Id);
		Log.pwd(Password);
		Log.signButton();
		//Hello new
	}
	@AfterMethod
	public void Logout()
	{
		//driver.quit();
		//		Com.logOutApp();
		//		WebElement w1 = Com.returnLog();
		//		wd.waitTillVisible(w1);
		//		Com.LogOut();
	}

}
