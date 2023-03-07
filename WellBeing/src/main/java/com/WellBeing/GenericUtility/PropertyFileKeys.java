package com.WellBeing.GenericUtility;

public enum PropertyFileKeys {
	URL("url"),LOGINID("LoginId"),PASSWORD("Password"),TIMEOUT("timeout"),BROWSER("Browser"),OPTION("Option");
	private String key;
	private PropertyFileKeys(String key)
	{
		this.key=key;
	}
	public String getKey()
	{
		return	key.toString();
	}

}
