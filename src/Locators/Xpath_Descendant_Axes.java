package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Descendant_Axes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://money.rediff.com/index.html");
		System.out.println(driver.findElement(By.xpath("//a[text()=\"S&P BSE 100\"]/ancestor::ul/descendant::a")).getText());
		System.out.println(driver.findElement(By.xpath("//li[text()=\"Index\"]/ancestor::ul/descendant::li")).getText());
		System.out.println(driver.findElement(By.xpath("//a[text()=\"Morepen Labs.Lt\"]/ancestor::h4/descendant::a")).getText());
		System.out.println(driver.findElement(By.xpath("//a[text()=\"More BSE Indices \"]/ancestor::p/descendant::a")).getText());
		System.out.println(driver.findElement(By.xpath("//b[text()=\"INFRA\"]/ancestor::a/descendant::b")).getText());
		System.out.println(driver.findElement(By.xpath("//b[text()=\"TOP MARKET CAPITAL COMPANIES\"]/ancestor::h2/descendant::b")).getText());
		System.out.println(driver.findElement(By.xpath("(//a[text()=\"Group-wise listing\"]/ancestor::td/descendant::a)[8]")).getText());
		System.out.println(driver.findElement(By.xpath("(//a[text()=\"My Portfolio\"]/ancestor::ul/descendant::a)[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//a[text()=\"Investment Tool\"]/ancestor::ul/descendant::a")).getText());
		System.out.println(driver.findElement(By.xpath("(//span[@class=\"blue curhand gainerloser\"]/ancestor::h2/descendant::span)[4]")).getText());

	driver.quit();
	
	}

}
