package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_LinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.naukri.com/mnjuser/homepage");

		driver.findElement(By.partialLinkText("Register for Fre")).click();
		driver.findElement(By.partialLinkText("About U")).click();
		
	
		System.out.println("Locator : partialLinkText");
	}

}
