package writeToExcel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
//import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) {
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Sheet1");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
					
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\tapan\\Downloads\\test.xlsx");
			cell.setCellValue("Hello World!");
			workbook.write(file);
			workbook.close();
			file.close();
		} catch (IOException e) {
			System.err.println("Caught IOException: " + e.getMessage());
			
		}
		System.out.println("Hello World!");
				
	}
}
