package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_Border {

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
JS.executeScript("arguments[0].style.border = '4px solid yellow'", username);
JS.executeScript("arguments[0].style.border = '3px solid red'", password);
JS.executeScript("arguments[0].style.border ='2px solid blue'", submit);
JS.executeScript("arguments[0].style.border = '3px solid green'", reset);
JS.executeScript("arguments[0].style.border = '4px solid orange'", here);
	}

}
