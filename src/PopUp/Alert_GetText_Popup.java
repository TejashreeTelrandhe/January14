package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_GetText_Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("Alert_GetText_Popup ");
		alt.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
		driver.quit();
	}

}
