package WebDriver_Methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_GetCurrentUrl_Quit_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.zerozilla.com/");

		String expectTitle = "IT Services Company | Software Development Services | Zerozilla";
		if (driver.getTitle().equals(expectTitle)) {
			System.out.println("Title matches successfully :" + expectTitle);
		} else {
			System.out.println("Title not matches");
		}

		String expectUrl = "https://www.zerozilla.com/";
		if (driver.getCurrentUrl().equals(expectUrl)) {
			System.out.println("Url matches successfully :" + expectUrl);
		} else {
			System.out.println("Url not matches");
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
