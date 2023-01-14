package Screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import net.bytebuddy.utility.RandomString;

public class Screenshot_6 {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/railways/");
		WebElement element1 = driver.findElement(By.xpath("//div[@class=\"serv_box\"]"));
		WebElement element2 = driver.findElement(By.xpath("(//div[@class=\"serv_box\"])[2]"));
		WebElement element3 = driver.findElement(By.xpath("(//div[@class=\"serv_box\"])[3]"));
		screenshot(element1,"11.trip");
		screenshot(element2,"12.trip");
		screenshot(element3,"13.trip");
	}
	public static void screenshot(WebElement element, String filename) throws IOException {
		
		String random = RandomString.make(2);		
		File src = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		File dest = new File(".//Screenshot" + filename + ""+ random + ".png");
		FileHandler.copy(src, dest);
	}

}
