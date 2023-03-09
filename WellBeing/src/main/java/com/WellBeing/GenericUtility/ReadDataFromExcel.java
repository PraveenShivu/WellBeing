package com.WellBeing.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	DataFormatter Data=new DataFormatter();
	FileInputStream fisExcel;
	Workbook book;
	FileOutputStream fout;
	public void openExcel()  
	{
		try {
			fisExcel=new FileInputStream(ConstantPath.EXCEL_FILE_PATH);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fisExcel);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getLastRowNum(String SheetName)  
	{	
		try {
			fisExcel=new FileInputStream(ConstantPath.EXCEL_FILE_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fisExcel);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int endRowNum = book.getSheet(SheetName).getLastRowNum();
		return endRowNum;
	}
	public int getLastCellNum(String SheetName,int RowNum) 
	{	
		int endCellNum = book.getSheet(SheetName).getRow(RowNum).getLastCellNum();
		return endCellNum;
	}
	public String getValue(String SheetName,int RowNum,int CellNum)
	{
		String Celldata =Data.formatCellValue(book.getSheet(SheetName).getRow(RowNum).getCell(CellNum)).trim();
		return Celldata;
	}
	public void setcellValue(String Sheetname,int RowNum,int CellNum,String status)
	{
		book.getSheet(Sheetname).getRow(RowNum).getCell(CellNum).setCellValue(status);
	}
	public void sendData() 

	{

		try {
			fout = new FileOutputStream(ConstantPath.EXCEL_FILE_PATH);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			book.write(fout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
