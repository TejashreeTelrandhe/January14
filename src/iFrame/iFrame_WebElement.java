package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_WebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Iframe with in an Iframe\"]")).click();
		WebElement outerframe = driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		driver.switchTo().frame(outerframe);

		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iframe");

		driver.switchTo().defaultContent();

	}

}
