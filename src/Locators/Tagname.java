package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demo.guru99.com/v4/index.php");
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		driver.findElement(By.tagName("input")).sendKeys("mngr464239");
		System.out.println(driver.findElement(By.tagName("td")).getText());
		System.out.println(driver.findElement(By.tagName("li")).getText());
		System.out.println(driver.findElement(By.tagName("span")).getText());
		System.out.println(driver.findElement(By.tagName("ul")).getText());
		
		driver.quit();

	}

}
