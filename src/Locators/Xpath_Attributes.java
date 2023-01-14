package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attributes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:email::content\"]")).sendKeys("tejashreetelrandhe1999@gmail.com");
	  driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:password::content\"]")).sendKeys("Tejashree@99");
	  driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:retypePassword::content\"]")).sendKeys("Tejashree@99");
	  driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:firstName::content\"]")).sendKeys("Tejashree");
	  driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:lastName::content\"]")).sendKeys("Telrandhe");
	  driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:jobTitle::content\"]")).sendKeys("QA");
	  driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:workPhone::content\"]")).sendKeys("4569871236");
	  driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:companyName::content\"]")).sendKeys("Talentica");
	  driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:address1::content\"]")).sendKeys("Umred");
	  driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:city::content\"]")).sendKeys("Nagpur");
	  driver.findElement(By.xpath("//input[@id=\"sView1:r1:0:postalCode::content\"]")).sendKeys("441203");
	  System.out.println(driver.findElement(By.xpath("//span[@id=\"signinlink::text\"]")).getText());
	
	}

}
