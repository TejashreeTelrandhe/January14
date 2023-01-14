package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Index {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("tej123@gmail.com");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Tejashree");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("Telrandhe");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("QA");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("1234567891");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[6]")).sendKeys("Entartica");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[7]")).sendKeys("Amravati");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[9]")).sendKeys("Amravati");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[10]")).sendKeys("441230");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("!@@#$%^");
		driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("!@@#$%^");
		System.out.println(driver.findElement(By.xpath("//h1[text()=\"Create Your Oracle Account\"]")).getText());
		Thread.sleep(8000);
		driver.quit();
	}

}
