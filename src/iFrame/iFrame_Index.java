package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrame_Index {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demoqa.com/frames");

		driver.switchTo().frame(2);
		System.out.println("First frame");
		System.out.println(driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText());
		driver.switchTo().defaultContent();

		driver.switchTo().frame(3);
		System.out.println("Second frame");
		System.out.println(driver.findElement(By.xpath("//h1[text()=\"This is a sample page\"]")).getText());
		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("(//div[@class=\"header-text\"])[3]")).click();
//		WebElement nestedframe = driver.findElement(By.xpath("(//li[@id=\"item-3\"])[2]"));
//		Actions act = new Actions(driver);
//		act.moveToElement(nestedframe).click().build();
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.switchTo().frame(2);
		driver.switchTo().frame(8);
		System.out.println(driver.findElement(By.xpath("//p[text()=\"Child Iframe\"]")).getText());

		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("//body[text()=\"Parent frame\"]")).getText());
		driver.quit();
	}

}
