package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("//home//ashvin//ExcelData//TestData.xlsx");
		//src is where the TestData(Excel sheet) path is stored.
		//Also Java will accept two // slashes instead of / one slash for the path.
		FileInputStream fis = new FileInputStream(src);
		//FileInputStream accepts the src file.
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//This will load the full workbook(complete).
		//for .xlsx XSSFWorkbook ; for .xlx HSSFWorkbook.
		XSSFSheet sheet1 = wb.getSheetAt(0);
		//XSSFsheet is a separate class and .getSheetAt(0) will select which sheet to be selected based on index value.
        
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		//In the sheet1 of row0 and column 2 we are writing a value "Pass".
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		//In the sheet1 of row1 and column 2 we are writing a value "Fail".
		
		FileOutputStream fout = new FileOutputStream(src);
		//For reading we are using FIS and for writing we are using FOS.
		wb.write(fout);
		//In the wb workbook we are calling the fout object where it will pass the values.
		
        wb.close();
        //Close it to avoid memory leak in Java.

	}

}
