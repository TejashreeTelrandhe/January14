package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/upload");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"file\"]"))
				.sendKeys("C:\\Users\\Tejashree\\eclipse-workspace\\AutomationPractice\\Screenshot1.easemytripGZ.png");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
