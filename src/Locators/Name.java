package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demo.guru99.com/v4/index.php");

        driver.findElement(By.name("uid")).sendKeys("mngr464239");
        driver.findElement(By.name("password")).sendKeys("sawerq");
        driver.findElement(By.name("btnReset")).click();
        driver.findElement(By.name("uid")).sendKeys("mngr464239");
        driver.findElement(By.name("password")).sendKeys("apYjEvA");
        driver.findElement(By.name("btnLogin"));
        driver.findElement(By.xpath("//a[contains(text(),'Selenium')]")).click();
        driver.quit();
	}

}
