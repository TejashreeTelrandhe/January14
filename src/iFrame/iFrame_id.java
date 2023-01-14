package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_id {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://demoqa.com/frames");

	driver.switchTo().frame("frame1");
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText());
	
	driver.switchTo().defaultContent();
	Thread.sleep(3000);

	driver.switchTo().frame("frame2");
	
	System.out.println(driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText());
	System.out.println("iframe id");
	
	Thread.sleep(3000);
	driver.close();
	}

}
