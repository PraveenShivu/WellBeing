package com.WellBeing.admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.WellBeing.GenericUtility.BaseClass;

public class CreatePatientWithAdminTest1
{
	@Test
	public void createPatientTest() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Patient Registration");
		Row row = sheet.getRow(2);
		Cell cel = row.getCell(2);
		String val = cel.getStringCellValue();
		System.out.println(val);
		
	}
}
