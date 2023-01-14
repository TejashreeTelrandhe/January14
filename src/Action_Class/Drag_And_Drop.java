package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/droppable");
		
		WebElement element1 = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement element2 = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));

		Actions act = new Actions(driver);
		act.dragAndDrop(element1, element2).perform();
		
		System.out.println(driver.findElement(By.xpath("//p[text()=\"Dropped!\"]")).getText());
		
	}

}
