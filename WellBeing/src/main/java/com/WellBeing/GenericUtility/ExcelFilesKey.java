package com.WellBeing.GenericUtility;

public enum ExcelFilesKey {
	
	private String key;
	private ExcelFilesKey(String key)
	{
		this.key=key;
	}
	public String getkey()
	{
		return key.toString();
	}

}

