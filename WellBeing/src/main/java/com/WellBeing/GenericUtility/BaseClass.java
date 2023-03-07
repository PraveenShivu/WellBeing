package com.WellBeing.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.WellBeingObjectRepo.CommonPage;
import com.WellBeingObjectRepo.LoginPage;

public class BaseClass {
	protected static WebDriver driver;
	public static WebDriver sdriver;
	protected ReadDataFromProperty Property;
	protected LoginPage Log;
	protected CommonPage Com;
	protected JavaUtility java;
	protected WebdriverUtility wd;

	@BeforeClass
	public void Launch()
	{
		Property=new ReadDataFromProperty();
		java=new JavaUtility();
		Log=new LoginPage(driver);
		Com=new CommonPage(driver);
		wd=new WebdriverUtility();
		String Browser = Property.getPropertyData(PropertyFileKeys.BROWSER.getKey());
		String Url = Property.getPropertyData(PropertyFileKeys.URL.getKey());
		String Time = Property.getPropertyData(PropertyFileKeys.TIMEOUT.getKey());
		Long timeWait = (Long)java.stringToAnyDataType(Time, "long");
		wd.LaunchApp(Browser, Url,timeWait);
		

	}
	@BeforeMethod
	public void Login()
	{
		String option = Property.getPropertyData(PropertyFileKeys.OPTION.getKey());
		String Id = Property.getPropertyData(PropertyFileKeys.LOGINID.getKey());
		String Password = Property.getPropertyData(PropertyFileKeys.PASSWORD.getKey());

		Log.facilityClick();
		WebElement d1 = Log.dropdown1();
		wd.drop1(d1);
		//wd.drop(d1, option);
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
