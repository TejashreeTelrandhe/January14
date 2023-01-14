package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/");

		driver.findElement(By.linkText("Testing")).click();
//		driver.navigate().refresh();
//		System.out.println(driver.findElement(By.linkText("SAP")).isEnabled());
		driver.navigate().back();
		driver.findElement(By.linkText("Live Project")).click();
		driver.navigate().to("https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.linkText("Companies")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Jobs")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Services")).click();
		Thread.sleep(8000);
		driver.quit();
	}

}
