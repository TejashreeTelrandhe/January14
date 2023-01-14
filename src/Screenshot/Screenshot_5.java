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

public class Screenshot_5 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/railways/");
		String filename = "trip";
		String random = RandomString.make(2);
		WebElement logo = driver.findElement(By.xpath("//i[@class=\"newHeaderLogo\"]"));

		File src = ((TakesScreenshot) logo).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Tejashree\\eclipse-workspace\\AutomationPractice\\Screenshot\\"+filename+""+random+".png");
		FileHandler.copy(src, dest);

	}

}
