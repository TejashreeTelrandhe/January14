package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demoqa.com/automation-practice-form");

		boolean b1 = driver.findElement(By.className("main-header")).isDisplayed();
		System.out.println(b1);
		boolean b2 = driver.findElement(By.className("header-text")).isDisplayed();
		System.out.println(b2);
		WebElement mob = driver.findElement(By.className("form-label"));
	    System.out.println(mob.getText());
	    
	    WebElement file = driver.findElement(By.className("form-file-label"));
	    System.out.println(file.getText());

	    WebElement seperator = driver.findElement(By.className("separator"));
	    System.out.println(seperator.isDisplayed());

	    driver.findElement(By.className("form-control")).sendKeys("Ajay");
	   
	    driver.quit();
	}

}
