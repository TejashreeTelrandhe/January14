package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_By_Element {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		WebElement e1 = driver.findElement(By.xpath("//h1[text()=\"Flipkart: The One-stop Shopping Destination\"]"));
		WebElement e2 = driver.findElement(By.xpath("//h2[text()=\"Beauty, Food, Toys & more\"]"));
		WebElement e3 = driver.findElement(By.xpath("//div[text()=\"Appliances\"]"));
		WebElement e4 = driver.findElement(By.xpath("//div[@class=\"LfkXVL\"]"));
		WebElement e5 = driver.findElement(By.xpath("//span[text()=\"Cart\"]"));
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].scrollIntoView();", e1);
		Thread.sleep(3000);
		JS.executeScript("arguments[0].scrollIntoView();", e2);
		Thread.sleep(3000);
		JS.executeScript("arguments[0].scrollIntoView();", e3);
		Thread.sleep(3000);
		JS.executeScript("arguments[0].scrollIntoView();", e4);
		Thread.sleep(3000);
		JS.executeScript("arguments[0].scrollIntoView();", e5);	
		Thread.sleep(3000);
		driver.quit();
	}

}
