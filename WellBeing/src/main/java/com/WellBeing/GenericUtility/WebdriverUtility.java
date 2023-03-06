package com.WellBeing.GenericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverUtility {
	WebDriver driver;
	public WebDriver LaunchApp(String Browser,String Url)
	{
		if(Browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		else if(Browser.equals("Fire Fox")) {
			WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Enter the Browser Name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	public void Close()
	{
		driver.quit();
	}
	public void waitapp1(long timeout,WebElement ele)
	{
	WebDriverWait wait1=new WebDriverWait(driver, timeout);
	wait1.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitapp2(long timeout,WebElement ele)
	{
		WebDriverWait wait2=new WebDriverWait(driver, timeout);
		wait2.until(ExpectedConditions.invisibilityOf(ele));
	}
public void drop(WebElement ele,String text)
{
	Select s=new Select(ele);
	s.selectByVisibleText(text);
	
}
public void KeyBoard() throws AWTException
{
	Robot rt=new Robot();
	rt.keyPress(KeyEvent.VK_DOWN);
	rt.keyRelease(KeyEvent.VK_DOWN);
	rt.keyPress(KeyEvent.VK_ENTER);
	rt.keyRelease(KeyEvent.VK_ENTER);
}
}
