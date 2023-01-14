package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Child_Axes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Mutual Fund Selector')]/ancestor::div/child::h2")).getText());
		System.out.println(driver.findElement(By.xpath("(//a[contains(text(),'Weekly')]/ancestor::div/child::div)[7]")).getText());
		System.out.println(driver.findElement(By.xpath("(//span[contains(text(),'Last updated: 23 Dec, 15:59')]/ancestor::div/child::div)[8]")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Ingersoll Rand')]/ancestor::tr/child::td")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Equity - Balance Fund')]/ancestor::tr/child::td")).getText());
		System.out.println(driver.findElement(By.xpath("(//h4[contains(text(),'Investment tracking')]/ancestor::tr/child::td)[3]")).getText());
	    Thread.sleep(3000);
	    driver.quit();
	}

}
