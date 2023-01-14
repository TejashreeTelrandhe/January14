package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		System.out.println(driver.findElement(By.xpath("//h1[text()=\"Create Your Oracle Account\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Already have an Oracle Account?\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Your email address is your username.\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Email Address\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Password\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Retype password\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Country\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Name\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Job Title\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Work Phone\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Company Name\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Address\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"City\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"State/Province\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()=\"ZIP/Postal Code\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[text()=\"You may opt-out of all marketing communications: \"]")).getText());

		driver.quit();
	}

}
