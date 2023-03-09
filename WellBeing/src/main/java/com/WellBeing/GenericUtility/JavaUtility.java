package com.WellBeing.GenericUtility;

import java.util.Random;

public class JavaUtility {
	
	public Object stringToAnyDataType(String s,String stratgy)
	{
		Object convertedData=null;
		if(stratgy.equals("int"))
		{
			convertedData=Integer.parseInt(s);			
		}
		else if(stratgy.equals("long"))
		{
			convertedData=Long.parseLong(s);
		}
	return convertedData;	
	}
	public int getRandomNumber(int limit)
	{
		int randomNumber = new Random().nextInt(limit);
		return randomNumber;
	}
	public String getId(String UHID)
	{
		String[] okId = UHID.split(" ");
		return okId[2];
	}
	
	

}
