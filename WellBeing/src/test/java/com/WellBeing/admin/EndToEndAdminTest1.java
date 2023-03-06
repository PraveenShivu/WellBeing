package com.WellBeing.admin;

import org.testng.annotations.Test;

import com.WellBeing.GenericUtility.BaseClass;

public class EndToEndAdminTest1 extends BaseClass
{
	@Test
	public void test1()
	{
		String t = driver.getTitle();
		System.out.println(t);
	}
	
}
