package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_1 {

	public static void main(String[] args) {
//		Web table in Selenium is a WebElement just like any other popular WebElements like 
//		text boxes, radio buttons, checkboxes, drop-down menus, etc. Web table and its 
//		contents can be accessed by using the WebElement functions along with locators to 
//		identify the element (row/column) on which the operation needs to be performed.
//
//		A table consists of rows and columns. The table created for a web page is called 
//		a web table. Below are some of the important tags associated with a web table:
//
//		< table > – Defines an HTML table
//		< th > – Contains header information in a table
//		< tr > – Defines a row in a table
//		< td > – Defines a column in a table

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		int row = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		System.out.println("Number of rows = " + row);

		int cell = driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
		System.out.println("Number of cells = " + cell);
//		Print specific values
		String value1 = driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[2]//td[1]")).getText();
		System.out.println(value1);

		String value2 = driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[4]//td[2]")).getText();
		System.out.println(value2);

//		Print all values

		for (int i = 2; i <= row; i++) {
			for (int j = 1; j <= cell; j++) {
				String data = 
						driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.print(data + "    ");
			}
			System.out.println();
		}
	}

}
