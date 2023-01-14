package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_JS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://demo.guru99.com/v4/index.php");
		WebElement username = driver.findElement(By.xpath("//input[@name=\"uid\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		WebElement submit = driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));

		JavascriptExecutor JS = (JavascriptExecutor) driver;

		JS.executeScript("arguments[0].value ='mngr464239'", username);
		JS.executeScript("arguments[0].value = 'apYjEvA'", password);
		JS.executeScript("arguments[0].click()", submit);
	}

}
