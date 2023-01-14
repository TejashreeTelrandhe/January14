package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.redbus.in/");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,-8000)", "");//down
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy (0,4000)", "");//up
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy (0,-3000)", "");//down
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy(0,3000)", "");//up
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy(0,-2000)", "");//down
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy(0,5000)", "");//up
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy(0,-3500)", "");//down
		
	}

}
