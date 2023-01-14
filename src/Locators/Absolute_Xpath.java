package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.findElement(By.xpath(
				"/html/body/div[2]/form/div/div[3]/div/div/div[5]/span/span/span/div/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/span/span/input"))
				.sendKeys("tejashreetelrandhe1999@gmail.com");
		driver.findElement(By.xpath(
				"/html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[1]/table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr/td[1]/span/span/input"))
				.sendKeys("Tejashree@99");
		driver.findElement(By.xpath(
				"/html/body/div/form/div/div[3]/div/div/div[5]/span/span/span/div/table/tbody/tr/td/table/tbody/tr[8]/td[2]/span/span/input"))
				.sendKeys("Tejashree@99");
		driver.findElement(By.xpath(
				"/html/body/div/form/div/div[3]/div/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr/td/div/div/table/tbody/tr/td/span/span/input"))
				.sendKeys("Ajay");
		driver.findElement(By.xpath(
				"/html/body/div/form/div/div[3]/div/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr/td[3]/div/div/table/tbody/tr/td/span/span/input"))
				.sendKeys("Atul");
		driver.findElement(By.xpath(
				"/html/body/div/form/div/div[3]/div/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/span/span/input"))
				.sendKeys("Devops engn");
		driver.findElement(By.xpath(
				"/html/body/div/form/div/div[3]/div/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[8]/td[2]/span/span/input"))
				.sendKeys("8999427533");
		driver.findElement(By.xpath(
				"/html/body/div/form/div/div[3]/div/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[11]/td[2]/span/span/input"))
				.sendKeys("Entartica");
		driver.findElement(By.xpath(
				"/html/body/div/form/div/div[3]/div/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[13]/td[2]/span/span/input"))
				.sendKeys("Umred");
		driver.findElement(By.xpath(
				"/html/body/div/form/div/div[3]/div/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[17]/td[2]/span/span/input"))
				.sendKeys("Nagpur");
		driver.findElement(By.xpath(
				"/html/body/div/form/div/div[3]/div/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[21]/td[2]/span/span/input"))
				.sendKeys("441203");

//		driver.quit();
	}

}
///html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/span/span/input
///html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[1]/table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr/td[1]/span/span/input
///html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr/td[1]/div/div[1]/table/tbody/tr/td/span/span/input
///html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr/td[1]/div/div[1]/table/tbody/tr/td/span/span/input
///html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr/td[3]/div/div[1]/table/tbody/tr/td/span/span/input
///html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/span/span/input
///html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/span/span/input
///html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[8]/td[2]/span/span/input
///html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[11]/td[2]/span/span/input
///html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[13]/td[2]/span/span/input
///html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[17]/td[2]/span/span/input
///html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[21]/td[2]/span/span/input