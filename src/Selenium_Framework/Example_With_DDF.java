package Selenium_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_With_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().window().maximize();

		driver.get("https://kite.zerodha.com/");

		String path = "C:\\Users\\Tejashree\\Desktop\\ExcelFile\\DDF_28_12.xlsx";

		FileInputStream file = new FileInputStream(path);

		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");

		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());

		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='password']"))
				.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]"))
				.sendKeys(sheet.getRow(1).getCell(2).getStringCellValue());
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		
		String actPN = driver.findElement(By.xpath("//h2[text()=\"NV7925\"]")).getText();
		System.out.println(actPN);
		String expPN = "NV7925";
		if (actPN.equals(expPN)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

}
