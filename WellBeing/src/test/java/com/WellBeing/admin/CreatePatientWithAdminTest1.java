package com.WellBeing.admin;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.WellBeing.GenericUtility.ReadDataFromExcel;

public class CreatePatientWithAdminTest1 
{
	@Test
	public void createPatientTest() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		DataFormatter df=new DataFormatter();
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		ReadDataFromExcel excel=new ReadDataFromExcel();
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Patient Registration");
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(2).getLastCellNum();
		System.out.println(row+" "+cell);
		for(int i=0;i<row-1;i++)
		{
			for(int j=0;j<cell;j++)
			{
				
				String value = df.formatCellValue(sheet.getRow(i+2).getCell(j));
				System.out.println(value);
				
		
			}
		}
	
		
	}
}
