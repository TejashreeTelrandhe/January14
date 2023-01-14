package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/v4/index.php");

		WebElement uid = driver.findElement(By.xpath("//input[@name=\"uid\"]"));

		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));

		guru99(driver, uid, "mngr464239");
		guru99(driver, password, "apYjEvA");
		
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();

	}

	public static void guru99(WebDriver driver, WebElement element, String value) {
		new WebDriverWait(driver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(element))
				.sendKeys(value);
	}
}
