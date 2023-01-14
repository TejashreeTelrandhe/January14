package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permission_Popup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions Option = new ChromeOptions();
		
		Option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(Option);

		driver.manage().window().maximize();

		driver.get("https://www.hdfcbank.com/");

		Thread.sleep(3000);
	}

}
