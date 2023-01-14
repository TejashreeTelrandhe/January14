package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demoqa.com/alerts");

		WebElement element = driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(element).perform();
		
		driver.switchTo().alert().accept();
	}

}
