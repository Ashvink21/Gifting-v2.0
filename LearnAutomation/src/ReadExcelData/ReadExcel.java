package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

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
        String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
        //the row 0 and column 0 is taken and return as string value.
        System.out.println("Data from Excel is " +data0);
        //Prints the data from which row and column.
        wb.close();
        //Close it to avoid memory leak in Java.

	}

}
