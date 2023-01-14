package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Contains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Create Your Oracle Account')]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Already have an Oracle Account?')]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Your email address is your username.')]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Email Address')]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Password')]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Retype password')]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Country')]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Name')]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Job Title')]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Work Phone')]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Company Name')]")).getText());
		System.out.println(driver.findElement(By.xpath("(//label[contains(text(),'Address')])[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'City')]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'State/Province')]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'ZIP/Postal Code')]")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Account Help')]")).getText());
        Thread.sleep(3000);
		driver.quit();
	}

}
