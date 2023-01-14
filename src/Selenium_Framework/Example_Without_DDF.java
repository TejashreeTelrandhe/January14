package Selenium_Framework;

import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Without_DDF {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().window().maximize();

		driver.get("https://kite.zerodha.com/");

		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("NV7925");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("8999427533");

		driver.findElement(By.xpath("//button[text()='Login ']")).click();

		String actPN = driver.findElement(By.xpath("//h2[text()=\"NV7925\"]")).getText();
		System.out.println(actPN);
		String expPN = "NV7925";
		if (actPN.equals(expPN)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
}
