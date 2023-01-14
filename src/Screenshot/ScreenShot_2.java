package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot_2 {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/railways/");
		
		multiple_ss("easetrip");
		multiple_ss("easemy");
		multiple_ss("mytrip");
	}
	public static void multiple_ss(String site) throws IOException {
		RandomString rr = new RandomString();
		String random = rr.make(5);
		site ="easemytrip";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Tejashree\\Desktop\\Autopractice\\ss."+site+""+random+".jpg");
		FileHandler.copy(Source,dest);
	}

}
