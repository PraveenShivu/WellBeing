package com.WellBeing.GenericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverUtility {
	WebDriver driver;
	Robot rt;
	WebDriverWait wait1;

	public WebDriver LaunchApp(String Browser,String Url,long time)
	{
		driver=null;
		if(Browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(Browser.equals("fire Fox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Enter the Browser Name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		driver.get(Url);
		return driver;

	}
	public void Close()
	{
		driver.quit();
	}
	public void waitapp1(long timeout,WebElement ele)
	{
		wait1=new WebDriverWait(driver, timeout);
		wait1.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitapp2(long timeout,WebElement ele)
	{

		wait1=new WebDriverWait(driver, timeout);
		wait1.until(ExpectedConditions.invisibilityOf(ele));
	}
	public void waitApp3(long timeout,WebElement ele)
	{
		WebDriverWait wait2=new WebDriverWait(driver, timeout);

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='Patienttype']")));
		

		wait2.until(ExpectedConditions.invisibilityOf(ele));


	}
	public void waitAndClick(WebElement ele)
	{
		wait1.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void drop(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByIndex(1);

	}
	public void drop1(WebElement ele)
	{
		Select s=new Select(ele);
		s.selectByValue("1");

	}
	public void KeyBoard() 
	{

		try {
			rt = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
	}
	public void sleep()
	{
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void waitTillVissible(WebElement ele11) 
	{
		int count=0;
		while(count<15)
		{
			try {
				ele11.click();
				break;
			}
			catch(Throwable e)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				count++;
			}
		}
	}
	public void newAction(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele);
	}
	public void javaScriptExe(WebElement ele)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();",ele);
	}
}
