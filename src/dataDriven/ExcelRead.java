package dataDriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;
		

		String path = "C:\\Users\\lupit\\Documents\\Code\\JAVA FULLSTACK PROGRAM\\Java\\IDE\\SeleniumWDTutorial\\files\\original.xlsx";
		String sheetName = "Sheet1";
		
		try {
			
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
			Cell = ExcelWSheet.getRow(1).getCell(2);
			String cellData = Cell.getStringCellValue();
			
			System.out.println("Valor en la celda es: " + cellData);
				
		} catch (Exception e) {
			e.getMessage();
		}
			
		
		
		
	}

}
