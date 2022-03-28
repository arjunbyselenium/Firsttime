package com.ActiTime.Generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib
{
	public String setPropertyData(String file) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/commondatas.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(file);
		return data;
	}
	public String setExcelDate(String sheetname,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

}
