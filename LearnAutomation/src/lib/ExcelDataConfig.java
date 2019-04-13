package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelDataConfig(String excelPath) {
		try 
		{
			File src = new File("//home//ashvin//ExcelData//TestData.xlsx");
			//src is where the TestData(Excel sheet) path is stored.
			//Also Java will accept two // slashes instead of / one slash for the path.
			FileInputStream fis = new FileInputStream(src);
			//FileInputStream accepts the src file.
			wb = new XSSFWorkbook(fis);
			//This will load the full workbook(complete).
			//for .xlsx XSSFWorkbook ; for .xlx HSSFWorkbook.
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			//Prints whatever message it throws.
		}
	}
	public String getData(int sheetNumber,int row,int column) 
	{
		sheet1 = wb.getSheetAt(sheetNumber);
		//XSSFsheet is a separate class and .getSheetAt(0) will select which sheet to be selected based on index value.
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		//gets the row and column value through the parameterized values.
		return data;
		//returns the data as string.
	}
}

