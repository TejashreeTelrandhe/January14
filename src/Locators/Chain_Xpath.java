package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chain_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/automation-practice-form");

		driver.findElement(By.xpath("//div[@class=\"col-md-4 col-sm-6\"]//input[@id=\"firstName\"]")).sendKeys("Priya");
		driver.findElement(By.xpath("//div[@class=\"col-md-4 col-sm-6\"]//input[@id=\"lastName\"]")).sendKeys("Indulkar");

		driver.findElement(By.xpath("//div[@class=\"col-md-9 col-sm-12\"]//input[@id=\"userEmail\"]")).sendKeys("priyaindulkar@gmail.com");
		WebElement gender = driver.findElement(By.xpath("//div[@class=\"custom-control custom-radio custom-control-inline\"]//input[@id=\"gender-radio-2\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(gender).click().perform();

		driver.findElement(By.xpath("//div[@class=\"col-md-9 col-sm-12\"]//input[@id=\"userNumber\"]")).sendKeys("9632587410");
		WebElement hoobies = driver.findElement(By.xpath("//div[@class=\"custom-control custom-checkbox custom-control-inline\"]//input[@id=\"hobbies-checkbox-1\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", hoobies);

		driver.findElement(By.xpath("//div[@class=\"col-md-9 col-sm-12\"]//textarea[@id=\"currentAddress\"]")).sendKeys("Amravati");
	    Thread.sleep(3000);
		driver.quit();
	}

}
