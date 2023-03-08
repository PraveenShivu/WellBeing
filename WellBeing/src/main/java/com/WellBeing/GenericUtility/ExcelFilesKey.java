package com.WellBeing.GenericUtility;

public enum ExcelFilesKey {
	PATIENT_REGISTRATION("Patient Registratio"),TITLE("Title"),FIRST_NAME("First Name"),LAST_NAME("Last Name"),GENDER("Gender"),DATE_OF_BIRTH("DateOfBirth"),MOBILE("Mobile"),STATUS("Status");	

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

