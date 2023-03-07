package com.WellBeing.admin;

import org.testng.annotations.Test;

import com.WellBeing.GenericUtility.BaseClass;
import com.WellBeing.GenericUtility.ReadDataFromProperty;

public class TestClass 
{
	@Test
	public void test()
	{
		ReadDataFromProperty rd=new ReadDataFromProperty();
		System.out.println(rd.getPropertyData("url"));
	}
}
