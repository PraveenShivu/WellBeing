package com.WellBeing.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.WellBeingObjectRepo.CommonPage;
import com.WellBeingObjectRepo.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	ReadDataFromProperty Property;
	LoginPage Log;
	CommonPage Com;
				
	@BeforeClass
	public void Launch()
	{
		 Property=new ReadDataFromProperty();
		 Log=new LoginPage(driver);
		 Com=new CommonPage(driver);	
	String Browser = Property.getPropertyData(PropertyFileKeys.BROWSER.getKey());
	String Url = Property.getPropertyData(PropertyFileKeys.URL.getKey());
	String Time = Property.getPropertyData(PropertyFileKeys.TIMEOUT.getKey());
	}
	@BeforeMethod
	public void Login()
	{
		String Id = Property.getPropertyData(PropertyFileKeys.LOGINID.getKey());
		String Password = Property.getPropertyData(PropertyFileKeys.PASSWORD.getKey());
		Log.enterLoginId(Id);
		Log.pwd(Password);
		Log.signButton();
	}
	@AfterMethod
	public void Logout()
	{
		Com.logOutApp();
	}
 
}
