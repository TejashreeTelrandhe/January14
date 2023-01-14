package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_FollowingSibling_Axes {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("https://money.rediff.com/losers/nse/daily/groupa");
	List <WebElement> list1 = driver.findElements(By.xpath("//a[contains(text(),'Weizmann')]/ancestor::tr/following-sibling::tr"));
	System.out.println("Number of first following-sibling node = "+list1.size());
	List <WebElement> list2 = driver.findElements(By.xpath("//a[contains(text(),'Pricol L')]/ancestor::tr/following-sibling::tr"));
	System.out.println("Number of second following-sibling node = "+list2.size());	
	List <WebElement> list3 = driver.findElements(By.xpath("//a[contains(text(),'Indiabulls Housing F')]/ancestor::tr/following-sibling::tr"));
	System.out.println("Number of third following-sibling node = "+list3.size());
	List <WebElement> list4 = driver.findElements(By.xpath("//a[contains(text(),'FACT')]/ancestor::tr/following-sibling::tr"));
	System.out.println("Number of fourth following-sibling node = "+list4.size());
	List <WebElement> list5 = driver.findElements(By.xpath("//a[contains(text(),'Butterfly Gandhima')]/ancestor::tr/following-sibling::tr"));
	System.out.println("Number of fifth following-sibling node = "+list5.size());	
	System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Butterfly Gandhima')]/ancestor::tr")).getText());
	driver.quit();
}
}
