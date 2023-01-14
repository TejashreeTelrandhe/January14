package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Following_Axes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://money.rediff.com/index.html");
		List <WebElement> list1 = driver.findElements(By.xpath("//div[@id=\"bse-hc\"]/following::a"));
		System.out.println("Number of first following node = "+list1.size());
		List <WebElement> list2 = driver.findElements(By.xpath("//li[text()=\"Price\"]/following::li"));
		System.out.println("Number of second following node = "+list2.size());	
		List <WebElement> list3 = driver.findElements(By.xpath("//a[text()=\"Advertise with us\"]/following::td"));
		System.out.println("Number of third following node = "+list3.size());
		List <WebElement> list4 = driver.findElements(By.xpath("//li[text()=\"7667.85\"]/following::li"));
		System.out.println("Number of fourth following node = "+list4.size());
		System.out.println(driver.findElement(By.xpath("//li[text()=\"7667.85\"]/ancestor::ul")).getText());
		List <WebElement> list5 = driver.findElements(By.xpath("//a[text()=\"KOVAI MEDICAL CENTER & HOSPITAL LTD.\"]/following::a"));
		System.out.println("Number of fifth following node = "+list5.size());		
		driver.quit();
	}

}
