package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		int row = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		System.out.println("Size of row : " + row);

		int col = driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
		System.out.println("Size of column : " + col);

//		Print specific values

		String value = driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[3]//td[2]")).getText();
		System.out.println(value);

		String values = driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[7]//td[1]")).getText();
		System.out.println(values);

//		to print the table

		for (int i = 2; i <= row; i++) {

			for (int j = 1; j <= col; j++) {

//				System.out.println(driver
//						.findElement(By.xpath("//table[@id=\"customers\"]//tr[" + i + "]//td[" + j + "]")).getText());
				
				
				String data = driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+i+"]//td["+j+"]")).getText();
				
				System.out.print(data + "      ");

			}
			System.out.println();
		}
	}

}
