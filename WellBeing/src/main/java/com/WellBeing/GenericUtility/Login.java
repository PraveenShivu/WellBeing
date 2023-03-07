package com.WellBeing.GenericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WellBeingObjectRepo.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	WebDriver driver;
	@Test
	public void log()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://192.168.29.86:818/");
		LoginPage log=new LoginPage(driver);
		//log.selectDropdown("Smiles Healthcare Inc.");
		log.enterLoginId("admin");
		log.pwd("123456");
		log.signButton();
	}
}
