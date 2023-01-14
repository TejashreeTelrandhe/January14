package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.zerozilla.com/web-design-develoement");

		WebElement element1 = driver.findElement(By.xpath("//span[text()=\"Company\"]"));
		WebElement element2 = driver.findElement(By.xpath("//span[text()=\"Solutions\"]"));
		WebElement element3 = driver.findElement(By.xpath("//span[text()=\"Insights\"]"));

		Actions act = new Actions(driver);

		act.moveToElement(element1).build().perform();
		
		WebElement team= driver.findElement(By.xpath("//span[text()=\"Our Team\"]"));
		System.out.println(team.getText());
		act.moveToElement(element2).build().perform();
		WebElement app= driver.findElement(By.xpath("//span[text()=\"Mobile Application Development\"]"));
		System.out.println(app.getText());
		act.moveToElement(element3).build().perform();
		WebElement port= driver.findElement(By.xpath("//span[text()=\"Portfolio\"]"));
		System.out.println(port.getText());
	}

}
