package com.WellBeing.admin;

import org.testng.annotations.Test;

import com.WellBeing.GenericUtility.BaseClass;

public class TestClass extends BaseClass
{
	@Test
	public void test()
	{
		System.out.println(driver.getTitle());
	}
}
