package com.dataproviders;

import org.testng.annotations.DataProvider;

import com.commons.ExcelDataConfig;

public class DataProviders {

	public static ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\ganesh.pirale\\eclipse-workspace\\RunJira1\\EditJira.xlsx");
	
	
	@DataProvider(name="CompanyNameProvider")
	public static Object[][] readData() {
		System.out.println("--- Start Data Provider ---");
		int rows = config.getRowCount(0);
		int cols = config.getColCount(0);
		System.out.println(" Rows : "+rows);
		System.out.println(" Cols : "+cols);
	/*	Object[][] data = new Object[rows-1][1];
		
		for (int i = 0; i < rows-1; i++) {
			
			for(int j = 0;j < cols; j++){
				
			
			data[i][0] = config.getData("Companies", i, j);*/
		
	Object[][] data = new Object[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			
			for(int j = 0;j < cols; j++){
				
			
			data[i][j] = config.getData("Companies", i, j);
		
		
			System.out.println(data[i][j]);
		}
			
		}
		System.out.println("--- Exit Data Provider ---");
		return data;
		
	}
}
