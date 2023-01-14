package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_2 {

	public static void main(String[] args) throws IOException {
String path ="C:\\Users\\Tejashree\\Desktop\\ExcelFile\\Excel26_12.xlsx";
FileInputStream file = new FileInputStream(path);

XSSFWorkbook workbook = new XSSFWorkbook(file);

XSSFSheet sheet = workbook.getSheet("Sheet1");

int row = sheet.getLastRowNum();
System.out.println(row);

int cell = sheet.getRow(0).getLastCellNum();
System.out.println(cell);

//for loop for printing all data from excel

for(int i =0;i< row;i++) {
	XSSFRow row1 = sheet.getRow(i);
	for(int j=0;j< cell;j++) {
		XSSFCell cell1= row1.getCell(j);
		
		switch(cell1.getCellType()) {
		case STRING : System.out.print(cell1.getStringCellValue());
		break;
		case NUMERIC :System.out.print(cell1.getNumericCellValue());
		break;
		case BOOLEAN : System.out.print(cell1.getBooleanCellValue());
		}
		System.out.print(" , ");
	}
	System.out.println();
}
	}

}
