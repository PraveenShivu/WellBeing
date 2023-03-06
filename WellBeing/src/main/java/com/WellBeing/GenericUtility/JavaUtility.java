package com.WellBeing.GenericUtility;

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

}
