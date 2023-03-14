package com.WellBeing.GenericUtility;

public enum PropertyFileKeys {
	URL("url"),LOGINID("LoginId"),PASSWORD("Password"),TIMEOUT("timeout"),BROWSER("Browser"),OPTION("Option"),LIMIT("Limit"),PATIENT_TYPE("Ambulatory Patient"),DEPARTMENT("General Medicine"),PROVIDER("OGHENEFEJIRO OGHI"),SERVICE_LOCATION("General Medicine Clinic");
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
