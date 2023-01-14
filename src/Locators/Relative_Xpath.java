package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:email::content\"]")).sendKeys("tejashree@gamil.com");
		driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:password::content\"]")).sendKeys("tej456");
		driver.findElement(By.xpath("//input[@name=\"sView1:r1:0:retypePassword\"]")).sendKeys("tej456");
		driver.findElement(By.xpath("(//input[@class=\"x25\"])[4]")).sendKeys("tej");
		driver.findElement(By.xpath("(//input[@class=\"x25\"])[5]")).sendKeys("shinde");
		driver.findElement(By.xpath("//input[@name=\"sView1:r1:0:jobTitle\"]")).sendKeys("QA");
		System.out.println(driver.findElement(By.xpath("//span[@class=\"x295 helpText-responsive show-desktop\"]")).getText());
		System.out.println(driver.findElement(By.xpath("(//span[@class=\"x295 helpText-responsive show-desktop\"])[2]")).getText());		
		System.out.println(driver.findElement(By.xpath("//label[@class=\"af_panelLabelAndMessage_label-text\"]")).getText());		
		System.out.println(driver.findElement(By.xpath("(//label[@class=\"af_panelLabelAndMessage_label-text\"])[12]")).getText());		
		
        Thread.sleep(3000);
		driver.quit();
	}

}
