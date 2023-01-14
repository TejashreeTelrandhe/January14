package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Action_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Thread.sleep(3000);
		
		Actions Act = new Actions(driver);
		Act.sendKeys(Keys.PAUSE).perform();
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
		Act.sendKeys(Keys.BACK_SPACE).perform();
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
		Act.sendKeys(Keys.CANCEL).perform();
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
		Act.sendKeys(Keys.ESCAPE).perform();
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
	}

}
