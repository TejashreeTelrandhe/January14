package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrame_name {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		WebElement frame =driver.findElement(By.xpath("//li[text()=\"iFrame\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(frame).click().build();
		driver.switchTo().frame("globalSqa");
		
		driver.findElement(By.xpath("(//a[@class=\"header_soc_facebook\"])[1]")).click();
		
		
	}

}
