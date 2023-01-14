package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.zerozilla.com/web-design-develoement");
		WebElement Company = driver.findElement(By.xpath("//span[text()=\"Company\"]"));
		WebElement Solutions = driver.findElement(By.xpath("//span[text()=\"Solutions\"]"));
		WebElement Insights = driver.findElement(By.xpath("//span[text()=\"Insights\"]"));
		WebElement Senddetails = driver.findElement(By.xpath("//span[text()=\"Send details\"]"));
		WebElement GetInTouch = driver.findElement(By.xpath("//span[text()=\"Get In Touch\"]"));
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].click()", Company);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//span[text()=\"About Us\"]")).isDisplayed());

		JS.executeScript("arguments[0].click()", Solutions);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Social Media Marketing\"]")).isDisplayed());

		JS.executeScript("arguments[0].click()", Insights);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Portfolio\"]")).isDisplayed());

		JS.executeScript("arguments[0].click()", Senddetails);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//label[@class=\"form-error\"]")).isDisplayed());
		JS.executeScript("arguments[0].click()", GetInTouch);

	}

}
