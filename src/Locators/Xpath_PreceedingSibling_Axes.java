package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_PreceedingSibling_Axes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://money.rediff.com/losers/nse/daily/groupa");
		List <WebElement> list1 = driver.findElements(By.xpath("//a[contains(text(),'Abans Holdings')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of first preceding-sibling node = "+list1.size());
		List <WebElement> list2 = driver.findElements(By.xpath("//a[contains(text(),'Indian Overseas')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of second preceding-sibling node = "+list2.size());	
		List <WebElement> list3 = driver.findElements(By.xpath("//td[contains(text(),'93.70')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of third preceding-sibling node = "+list3.size());
		List <WebElement> list4 = driver.findElements(By.xpath("//font[contains(text(),'-12.41')]/ancestor::td/preceding-sibling::td"));
		System.out.println("Number of fourth preceding-sibling node = "+list4.size());
		List <WebElement> list5 = driver.findElements(By.xpath("//a[contains(text(),'Easy Trip Planners')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of fifth preceding-sibling node = "+list5.size());	
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Easy Trip Planners')]/ancestor::tr/preceding-sibling::tr")).getText());
		driver.quit();
	}

}
