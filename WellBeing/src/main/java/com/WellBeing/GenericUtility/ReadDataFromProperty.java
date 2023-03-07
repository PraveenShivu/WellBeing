package com.WellBeing.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	FileInputStream fisProp;
	public String getPropertyData(String key) 
	{

		try {

			fisProp = new FileInputStream(ConstantPath.PROPERTY_FILE_PATH);

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fisProp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Value = prop.getProperty(key).trim();
		return Value;
	}
	public void closePropertyFile() 
	{
		try {
			fisProp.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




}
