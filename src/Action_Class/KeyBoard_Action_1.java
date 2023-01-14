package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Action_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("Tejashree Telrandhe");
		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("tejashree@gmail.com");
		
		WebElement Current_Address  = 	driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]"));		
		WebElement Permanent_Address = 	driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
		
		Current_Address.sendKeys("Shivaji Ward, Umred, Nagpur - 441203");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.keyDown(Keys.TAB);		
		act.perform(); 
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		WebElement Submit  = 	driver.findElement(By.xpath("//button[@id=\"submit\"]"));
	JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].click()", Submit);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@class=\"border col-md-12 col-sm-12\"]")).getText());
	}

}
