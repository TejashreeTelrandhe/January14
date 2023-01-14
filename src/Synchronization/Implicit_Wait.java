package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver. manage(). timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/v4/index.php");

        driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr464239");

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("apYjEvA");
		
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		
		driver.findElement(By.xpath("//a[text()=\"New Account\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"New Account\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("11081");
		driver.findElement(By.xpath("//input[@name=\"inideposit\"]")).sendKeys("3500");
		driver.findElement(By.xpath("//input[@name=\"button2\"]")).click();
	}

}
