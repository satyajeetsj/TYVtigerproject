package com.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_FileUtility {

	public static String getData(String sheet, int row, int cell)
	{
		String value="";
		try {
			FileInputStream fis=new FileInputStream("../VTIGER_prac/Vtiger_Excel.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
			value=c.getStringCellValue();
		
			
		} 
		catch (Exception e) {
			System.out.println("Unable to fetch data");
			
		}
		return value;
	}
}
