package com.WellBeing.GenericUtility;

public enum ExcelFilesKey {
	PATIENT_REGISTRATION("Patient Registration"),TITLE("Title"),FIRST_NAME("First Name"),LAST_NAME("Last Name"),GENDER("Gender"),DATE_OF_BIRTH("DateOfBirth"),MOBILE("Mobile"),STATUS("Status"),PATIENT_REGISTRATION_TEST("Patient Registration Test"),SERVICE_LIST("Service List");	

	private String key;
	private ExcelFilesKey(String key)
	{
		this.key=key;
	}
	public String getkey()
	{
		return key.toString().trim();
	}

}

