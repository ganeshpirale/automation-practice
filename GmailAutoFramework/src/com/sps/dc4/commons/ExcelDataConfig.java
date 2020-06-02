package com.sps.dc4.commons;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataConfig(String excelPath) 
	{
		try 
		{
			File file = new File(excelPath);
			FileInputStream inputStream = new FileInputStream(file);
			wb = new XSSFWorkbook(inputStream);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(String sheetName, int row, int col)
	{
		sheet = wb.getSheet(sheetName);
		if(col == 3)
		{

			String data = sheet.getRow(row).getCell(col).getNumericCellValue()+"";
			return data;
		}
		System.out.println("Sheet Name:"+sheetName);
		return sheet.getRow(row).getCell(col).getStringCellValue(); // need to check following link with switch case for string and numeric type
		
		//http://www.programcreek.com/java-api-examples/index.php?class=org.apache.poi.hssf.usermodel.HSSFCell&method=getStringCellValue
		
	}
	
	public int getRowCount(int sheetIndex) 
	{
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
	}
	
	public int getColCount(int sheetIndex) 
	{
		sheet = wb.getSheetAt(sheetIndex);
		int col = sheet.getRow(0).getLastCellNum();
		return col;
	}
}
