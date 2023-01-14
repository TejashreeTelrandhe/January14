package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_3 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Tejashree\\Desktop\\ExcelFile\\Excel26_12.xlsx";
		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int row = sheet.getLastRowNum();
		System.out.println(row);

		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println(cell);

		// for loop for printing all data from excel

		for (int i = 0; i < row; i++) {
			XSSFRow row1 = sheet.getRow(i);
			for (int j = 0; j < cell; j++) {
				String values = row1.getCell(j).toString();
				System.out.print(values+", ");
			}
			System.out.println("  ");
		}
		System.out.println();
	}
}