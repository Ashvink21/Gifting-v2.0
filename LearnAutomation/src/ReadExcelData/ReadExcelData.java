package ReadExcelData;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		
		ExcelDataConfig excel = new ExcelDataConfig("//home//ashvin//ExcelData//TestData.xlsx");
        System.out.println(excel.getData(1, 0, 0));
	}

}
