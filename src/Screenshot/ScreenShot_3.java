package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot_3 {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/railways/");
		String random = RandomString.make(2);
		String filename = "easemytrip";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File dest= new File("C:\\Users\\Tejashree\\eclipse-workspace\\AutomationPractice\\Screenshot\\"+filename+""+random+".jpg");

		File dest = new File(".//Screenshot" + filename + ""+ random + ".jpg");
		
//		File dest = new File(("user.dir")+"//Screenshot//"+filename+""+random+".jpg");
		FileHandler.copy(src, dest);
	}

}
