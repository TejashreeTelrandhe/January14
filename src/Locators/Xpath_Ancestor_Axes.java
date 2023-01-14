package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Ancestor_Axes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Gokaldas Exports')]/ancestor::tr")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'A-Z')]/ancestor::tr")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'3M India Ltd.')]/ancestor::tr")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'All Pages')]/ancestor::ul")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Apar Industries')]/ancestor::tr")).getText());
		System.out.println(driver.findElement(By.xpath("//h4[contains(text(),'Mutual Funds')]/ancestor::tr")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Terms of Service')]/ancestor::center")).getText());
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'e.g. Tata motors, Reliance MF, 500570')]/ancestor::form/child::div")).getText());

		Thread.sleep(3000);
		driver.quit();
	}

}
