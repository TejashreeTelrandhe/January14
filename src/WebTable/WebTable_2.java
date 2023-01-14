package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

		List<WebElement> Row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println("Number of Rows = "+Row.size());
		
		List<WebElement> Cell = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println("Number of Cells = "+Cell.size());
		
		System.out.println(driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[5]/td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[3]/td[3]")).getText());
		
		for(int i=2;i<Row.size();i++) {
			for(int j=1;j<Cell.size();j++) {
				System.out.print(driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+"   ");
			}
			System.out.println();
		}
	driver.quit();
	}

}
