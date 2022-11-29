package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_Register_Patient {

	
	static FileInputStream fis = null;
	
	public FileInputStream getFileInputStream() 
	{
	
		String filepath = System.getProperty("user.dir")+"/Test-data/RegisterPatient_Data.xlsx";
		File srcfile = new File (filepath);
		
		
		try {
				fis = new FileInputStream(srcfile);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Test Data File Not Found. Terminating process, Check File Path");
			System.exit(0);	
		} 
		
		return fis;		
	}
	
	
	
	public Object[][] getExcelData() throws Throwable  {

		
		fis = getFileInputStream();
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		

		int number_of_rows = (sheet.getPhysicalNumberOfRows()+1);
		int number_of_columns = 6  ;

		String[][] myarrayExcel = new String[number_of_rows ][number_of_columns];

		for (int i = 1; i < number_of_rows; i++) {
			for (int c = 1; c < number_of_columns; c++) {
				
				XSSFRow row = sheet.getRow(i);
				myarrayExcel [i - 1][c] = row.getCell(c).toString();
				
			}
		}
		wb.close();
		return myarrayExcel;

	}
 
}
