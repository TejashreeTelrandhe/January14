package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Right_Click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement element = driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(element).perform();
		
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Edit\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Cut\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Copy\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Paste\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Delete\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Quit\"]")).getText());
		driver.findElement(By.xpath("//span[text()=\"Quit\"]")).click();
		driver.switchTo().alert().accept();
	}

}
