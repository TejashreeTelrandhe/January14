package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Preceeding_Axes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://money.rediff.com/losers/nse/daily/groupa");
		List <WebElement> list1 = driver.findElements(By.xpath("//a[contains(text(),'Abans Holdings')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of first preceding node = "+list1.size());
		List <WebElement> list2 = driver.findElements(By.xpath("//a[contains(text(),'Royal Orchid Hotels')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of second preceding node = "+list2.size());	
		List <WebElement> list3 = driver.findElements(By.xpath("//a[contains(text(),'Bharat Road Network')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of third preceding node = "+list3.size());
		List <WebElement> list4 = driver.findElements(By.xpath("//a[contains(text(),'Infibeam Avenues')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of fourth preceding node = "+list4.size());
		List <WebElement> list5 = driver.findElements(By.xpath("//a[contains(text(),'Landmark Property De')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of fifth preceding node = "+list5.size());	
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Reliance Ind.Inf')]/ancestor::tr/preceding::tr")).getText());
		driver.quit();
	}

}
