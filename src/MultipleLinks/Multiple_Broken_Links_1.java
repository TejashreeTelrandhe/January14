package MultipleLinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Broken_Links_1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.softwaretestingmaterial.com/testng-interview-questions/");
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("Number of links = "+links.size( ));
		int brokenlink=0;
		for(WebElement link:links) {
			String url = link.getAttribute("href");
			if((url==null)||(url.isEmpty())) {
				System.out.println("url is null or empty");
				continue;	
			}
			URL LINK = new URL(url);
			HttpsURLConnection httpcode = (HttpsURLConnection) LINK.openConnection();
			httpcode.connect();
			if(httpcode.getResponseCode() >=400) {
				System.out.println(httpcode.getResponseCode()+"-->"+url+"-->"+"Broken Link");
				brokenlink++;
			}
			else {
				System.out.println(httpcode.getResponseCode()+"-->"+url+"-->"+"Valid Link");
			}
		}
		System.out.println("Number of broken links :" + brokenlink);
	}

}
