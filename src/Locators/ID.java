package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.get("https://livesql.oracle.com/apex/f?p=590:1000");

		driver.findElement(By.id("t_Button_navControl")).click();
		
		boolean b = driver.findElement(By.id("R5090808280793901")).isDisplayed();
		System.out.println(b);
		
		boolean bb = driver.findElement(By.id("P1000_SEARCH")).isEnabled();
		System.out.println(bb);
		
		driver.findElement(By.id("B3799591725161702")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("sso_username")).sendKeys("tejashreetelrandhe1999@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.id("ssopassword")).sendKeys("Tejashree@99");
		Thread.sleep(3000);

		driver.findElement(By.id("signin_button")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
