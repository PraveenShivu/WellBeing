package com.WellBeing.admin;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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
	@Test
	public void serviceFetch() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		DataFormatter df=new DataFormatter();
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		ReadDataFromExcel excel=new ReadDataFromExcel();
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Service List");
		int row = sheet.getLastRowNum();
		short cell = sheet.getRow(1).getLastCellNum();
		int count=0;	
		ArrayList<String> serList=new ArrayList ();
			for (int i = 1; i < row; i++)
			{
				for (int j = 0; j < cell; j++)
				{
					if(count<4) 
					{
					String value = df.formatCellValue(sheet.getRow(i).getCell(j));
					serList.add(value);
					count++;
					}
				}
			}		
	}
	@Test
	public void serviceFetch1()
	{
		java.util.Date d=new java.util.Date();
		SimpleDateFormat sd=new SimpleDateFormat("dd_MM_YYYY:-hh:mm:sss");
		System.out.println(sd.format(d));
		LocalDateTime local = LocalDateTime.now();
		System.out.println(sd.format(local));
		
		
		
	}
}
