package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Forward_Backward {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://qodeinteractive.com/catalog/");
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		JS.executeScript("window.scrollBy (4000,0)", "");//forward
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy (-3000,0)", "");//backward
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy(20000,3000)", "");//forward
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy(-1000,0)", "");//backward
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy(35000,0)", "");//forward
		Thread.sleep(3000);
		JS.executeScript("window.scrollBy(-20000,0)", "");//backward
		System.out.println("Horizontal Scrolling achieved");
	}

}
