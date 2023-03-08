package com.WellBeing.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.WellBeingObjectRepo.CommonPage;
import com.WellBeingObjectRepo.LoginPage;

public class BaseClass {

	protected  WebDriver driver;
	public  WebDriver sdriver;
	protected ReadDataFromProperty Property;


	

	protected LoginPage Log;
	protected CommonPage Com;
	protected JavaUtility java;
	protected WebdriverUtility wd;
	protected ReadDataFromExcel exl;



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

		


		sdriver=driver;
		driver=wd.LaunchApp(Browser, Url,timeWait);

        Log=new LoginPage(driver);

   

		
		
		Log=new LoginPage(driver);

		Com=new CommonPage(driver);

	}
	@BeforeMethod
	public void Login()
	{ 
		
		LoginPage log =new LoginPage(driver);
		String option = Property.getPropertyData(PropertyFileKeys.OPTION.getKey());
		System.out.println(option);
		String Id = Property.getPropertyData(PropertyFileKeys.LOGINID.getKey());
		System.out.println(Id);
		String Password = Property.getPropertyData(PropertyFileKeys.PASSWORD.getKey());


		System.out.println(Password);


		
		

		Log.facilityClick();

		Log.enterLoginId(Id);
		Log.pwd(Password);
		Log.signButton();
		
	}
	@AfterMethod
	public void Logout()
	{
		driver.quit();
//		Com.logOutApp();
//		WebElement w1 = Com.returnLog();
//		wd.waitTillVisible(w1);
//		Com.LogOut();
	}

}
