package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

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
        int rowcount = sheet1.getLastRowNum();
        //This will give the last row number of sheet1 and store it in rowcount object of int variable.
        System.out.println("Total row is" +rowcount);
        //Prints the Total row count.
        
        for(int i=0;i<rowcount;i++)
        {
		String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
		//get the row value and column value and return as string value ans store it in data0 object as string variable.
        //ignore//System.out.println("Test Data from Excel is "+data0);
        System.out.println("Data from Row"+i+" is "+data0);
        //To check from where the data is coming.
        }
        
        wb.close();
        //Close it to avoid memory leak in Java.

	}

}
