package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_4 {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.easemytrip.com/railways/");

screenshot("1.easemytrip");
screenshot("2.easemytrip");
screenshot("3.easemytrip");
	}
	public static void screenshot(String filename) throws IOException {

		String random = RandomString.make(2);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(".//Screenshot" + filename + ""+ random + ".png");
		
		FileHandler.copy(src, dest);
	}

}
