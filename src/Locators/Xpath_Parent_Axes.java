package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath_Parent_Axes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Shilpa Medicare L')]/parent::td")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Brigade Enterprises')]/parent::td")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'IOL Chemicals and Ph')]/parent::td")).getText());
		System.out.println(driver.findElement(By.xpath("//th[contains(text(),'Current Price (Rs)')]/parent::tr")).getText());
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Gainers')]/parent::div")).getText());
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'ALL MONEYWIZ PAGES ')]/parent::div")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Budget 2022')]/parent::td")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Gokaldas Exports')]/parent::td")).getText());

		Thread.sleep(3000);
		driver.quit();
	}

}
