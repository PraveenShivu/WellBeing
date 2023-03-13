package com.WellBeing.admin;

import org.testng.annotations.Test;

import com.WellBeing.GenericUtility.BaseClass;
import com.WellBeing.GenericUtility.ExcelFilesKey;

public class PatientRegistrationTest extends BaseClass
{
	@Test
	public void patientTest() throws InterruptedException
	{
		String pageName = ExcelFilesKey.PATIENT_REGISTRATION.getkey();
		int row = exl.getLastRowNum(pageName);
		int cel = exl.getLastCellNum(pageName, 0);
		String expectedTestCase = ExcelFilesKey.PATIENT_REGISTRATION_TEST.getkey();
		String actualtestCase="";
		String expKey1=ExcelFilesKey.TITLE.getkey();
		String actKey1="";
		String expKey2=ExcelFilesKey.FIRST_NAME.getkey();
		String actKey2="";
		String expKey3=ExcelFilesKey.LAST_NAME.getkey();
		String actKey3="";
		String expKey4=ExcelFilesKey.GENDER.getkey();
		String actKey4="";
		String expKey5=ExcelFilesKey.DATE_OF_BIRTH.getkey();
		String actKey5="";
		String expKey6=ExcelFilesKey.MOBILE.getkey();
		String actKey6="";
		
		for (int i = 1; i <= row; i++)
		{
			actualtestCase=exl.getValue(pageName, i, 1).trim();
			if(actualtestCase.equalsIgnoreCase(expectedTestCase))
			{
				for(int j=0;j<cel;j++)
				{
					actKey1=exl.getValue(pageName, i, j);
					if(actKey1.equalsIgnoreCase(expKey1))
					{
						actKey1=exl.getValue(pageName, i+1, j);
					}
					
					if(actKey1.equals(expKey2))
					{
						actKey2=exl.getValue(pageName, i+1, j);
					}
					//actKey3=exl.getValue(pageName, i, j);
					if(actKey1.equals(expKey3))
					{
						actKey3=exl.getValue(pageName, i+1, j);
					}
					//actKey4=exl.getValue(pageName, i, j);
					if(actKey1.equals(expKey4))
					{
						actKey4=exl.getValue(pageName, i+1, j);
					}
					//actKey5=exl.getValue(pageName, i, j);
					if(actKey1.equals(expKey5))
					{
						actKey5=exl.getValue(pageName, i+1, j);
					}
					//actKey6=exl.getValue(pageName, i, j);
					if(actKey1.equals(expKey6))
					{
						
						actKey6=exl.getValue(pageName, i+1, j);
					}
				}
				
			}
			
		}
		Com.identityClick();
		idntmgt.patientRegistrationButton();
		patient.title(4);
		patient.firstName(actKey2+randomNumber);
		patient.lastName(actKey3+randomNumber);
		patient.Gender(actKey4);
		patient.Num(actKey6);
		patient.But();
		String id = patient.popupUnsuccess();
		System.out.println(id);
		String uId = patient.getUhid();
		String gntdId = java.getId(uId);
		System.out.println(gntdId);
		Com.identityClick();
		idntmgt.encounterCreationButton();
		
		Thread.sleep(5000);
		ecCreate.ecreation();
		Thread.sleep(5000);
		ecCreate.Uhid(gntdId);	
		wd.KeyBoard();
		ecCreate.Search();
		ecCreate.COH();
		ecCreate.patientTypeDpdn("Ambulatory Patient");
		ecCreate.deptDpdn("General Medicine");
		ecCreate.providerDpdn("OGHENEFEJIRO OGHI");
		ecCreate.locDpdn("General Medicine Clinic");
		ecCreate.saveButton();
		String gntdEid = ecCreate.getEid();
		System.out.println(gntdEid);		
		
	}
}
