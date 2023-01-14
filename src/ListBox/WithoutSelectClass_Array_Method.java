package ListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectClass_Array_Method {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/railways/");
		driver.findElement(By.xpath("//input[@id=\"txtfromcity\"]")).click();
		String element1 = "//div[@class=\"_16Y_\"]//div";				
		listbox(element1,"SBC - Ksr Bengaluru");
		
		driver.findElement(By.xpath("//input[@id=\"txtdesticity\"]")).click();
		String element2 = "(//div[@class=\"_16Y_\"])[2]//div";
		listbox(element2,"HWH - Howrah Jn");
		
		driver.findElement(By.xpath("//span[@id=\"NextDayName\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"bsrc-btn\"]")).click();
        Thread.sleep(3000);
        driver.quit();
	}

	public static void listbox(String element, String value) {
		List<WebElement> s1 = driver.findElements(By.xpath(element));
		System.out.println(s1.size());
		for (int i = 0; i < 51; i++) {
			System.out.println(s1.get(i).getText());
			if (s1.get(i).getText().equals(value)) {
				s1.get(i).click();
			}
		}
	}
}
