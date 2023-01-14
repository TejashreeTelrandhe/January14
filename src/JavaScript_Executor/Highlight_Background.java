package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_Background {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://demo.guru99.com/v4/index.php");
		WebElement username = driver.findElement(By.xpath("//input[@name=\"uid\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		WebElement submit = driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
		WebElement reset = driver.findElement(By.xpath("//input[@name=\"btnReset\"]"));
		WebElement here = driver.findElement(By.xpath("//a[text()=\"here\"]"));
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		JS.executeScript("arguments[0].style.background ='red'", username);
		JS.executeScript("arguments[0].style.background = 'blue'", password);
		JS.executeScript("arguments[0].style.background = 'orange'",submit);
		JS.executeScript("arguments[0].style.background ='pink'", reset);
		JS.executeScript("arguments[0].style.background = 'yellow'", here);	
		
	}

}
