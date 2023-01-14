package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//p[text()=\"Child Iframe\"]")).getText());
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("//body[text()=\"Parent frame\"]")).getText());
		driver.switchTo().defaultContent();
	}

}
